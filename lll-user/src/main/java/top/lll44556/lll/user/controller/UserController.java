package top.lll44556.lll.user.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lll44556.lll.common.utils.R;
import top.lll44556.lll.user.service.UserService;
import top.lll44556.lll.user.vo.user.UserInfoVo;

@RestController
@AllArgsConstructor
@RequestMapping("lll/user")
public class UserController {

    private final UserService userService;

    @GetMapping("hello")
    public R<String> hello() {
        return R.ok("hello world");
    }


    @GetMapping("userInfo")
    public R<UserInfoVo> userInfo(@AuthenticationPrincipal Jwt jwt) {

        String username = (String) jwt.getClaim("username");
        Long userId = (Long) jwt.getClaim("user_id");
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setUsername(username);
        userInfoVo.setId(userId);

        return R.ok(userInfoVo);
    }
}
