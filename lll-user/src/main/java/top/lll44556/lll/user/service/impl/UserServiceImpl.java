package top.lll44556.lll.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.lll44556.lll.user.entity.User;
import top.lll44556.lll.user.service.UserService;
import top.lll44556.lll.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author liululu
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-12-24 15:11:57
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




