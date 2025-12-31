//package top.lll44556.lll.auth.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.List;
//
//@Configuration
//public class CorsConfig {
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
////        CorsConfiguration config = new CorsConfiguration();
////        config.addAllowedOrigin("*");
////        config.addAllowedOriginPattern("*");
////        config.setAllowCredentials(true);
////        config.addAllowedMethod("*");
////        config.addAllowedHeader("*");
////
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        source.registerCorsConfiguration("/**", config);
////        return source;
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowedOrigins(List.of("http://auth-ui:5173", "http://192.168.1.100:11001"));
//        config.setAllowCredentials(true);
//        config.setAllowedMethods(List.of("GET","POST","PUT","DELETE","OPTIONS"));
//        config.setAllowedHeaders(List.of("*"));
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//        return source;
//    }
//}
