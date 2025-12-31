package top.lll44556.lll.user.vo.user;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


@Data
public class UserInfoVo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private Integer orgId;

    private Integer enabled;

    private String phone;

    private String email;
}
