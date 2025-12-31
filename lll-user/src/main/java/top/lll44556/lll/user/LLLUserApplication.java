package top.lll44556.lll.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.lll44556.lll.user.mapper")
public class LLLUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(LLLUserApplication.class, args);
    }
}
