package id.my.hendisantika.onlinevisitortracker.config;

import id.my.hendisantika.onlinevisitortracker.logger.VisitorLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-online-visitor-tracker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/13/24
 * Time: 06:20
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@RequiredArgsConstructor
public class AppConfig implements WebMvcConfigurer {

    private final VisitorLogger visitorLogger;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(visitorLogger);
    }

}
