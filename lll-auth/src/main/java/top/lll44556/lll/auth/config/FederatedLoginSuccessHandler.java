package top.lll44556.lll.auth.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import top.lll44556.lll.auth.constant.URLConstant;

import java.io.IOException;

public class FederatedLoginSuccessHandler implements AuthenticationSuccessHandler {

    public static final String ATTR_CONTINUE_URL = "OAUTH2_AUTHZ_CONTINUE_URL";
    private final RequestCache requestCache;
    private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    public FederatedLoginSuccessHandler(RequestCache requestCache) {
        this.requestCache = requestCache;
    }


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        SavedRequest savedRequest = this.requestCache.getRequest(request, response);
        if (savedRequest != null) {
            if (authentication instanceof OAuth2AuthenticationToken) {
                System.out.println("⚡ oauth2获取授权成功");
            } else {
                this.redirectStrategy.sendRedirect(request, response, "/oauth2/authorize");
            }
            String continueUrl = savedRequest.getRedirectUrl();
            System.out.println("original continueUrl = " + continueUrl);
            if (continueUrl != null && continueUrl.endsWith("&continue")) {
                continueUrl = continueUrl.substring(0, continueUrl.length() - "&continue".length());
            }
            System.out.println("new continueUrl = " + continueUrl);
            request.getSession(true).setAttribute(ATTR_CONTINUE_URL, continueUrl);
        } else {
            System.out.println("savedRequest 为 null");
        }
        this.redirectStrategy.sendRedirect(request, response, URLConstant.RequestBindingURL);
    }
}
