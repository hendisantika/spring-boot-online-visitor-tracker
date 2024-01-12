package id.my.hendisantika.onlinevisitortracker.logger;

import id.my.hendisantika.onlinevisitortracker.service.VisitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-online-visitor-tracker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/13/24
 * Time: 06:21
 * To change this template use File | Settings | File Templates.
 */
@Component
@RequiredArgsConstructor
public class VisitorLogger implements HandlerInterceptor {

    private final VisitorService visitorService;
}
