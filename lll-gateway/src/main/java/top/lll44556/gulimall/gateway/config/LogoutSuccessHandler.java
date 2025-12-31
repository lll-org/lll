package top.lll44556.gulimall.gateway.config;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.WebFilterExchange;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.net.URI;

@Component
public class LogoutSuccessHandler implements ServerLogoutSuccessHandler {
    // 退出后回到前端哪个地址
    private final URI postLogoutRedirectUri = URI.create("http://localhost:5173/");

    @Override
    public Mono<Void> onLogoutSuccess(WebFilterExchange exchange, Authentication authentication) {
        var response = exchange.getExchange().getResponse();

        // 302 重定向到前端页面
        response.setStatusCode(HttpStatus.FOUND);
        response.getHeaders().setLocation(postLogoutRedirectUri);

        // 如果你前端需要清理一些本地状态，可以顺便加个提示头（可选）
        // response.getHeaders().add("X-Logged-Out", "1");

        return response.setComplete();
    }
}
