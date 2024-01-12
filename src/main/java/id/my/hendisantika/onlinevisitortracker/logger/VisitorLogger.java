package id.my.hendisantika.onlinevisitortracker.logger;

import id.my.hendisantika.onlinevisitortracker.entity.Visitor;
import id.my.hendisantika.onlinevisitortracker.service.VisitorService;
import id.my.hendisantika.onlinevisitortracker.util.HttpRequestResponseUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.LocalDateTime;

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

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        final String ip = HttpRequestResponseUtils.getClientIpAddress();
        final String url = HttpRequestResponseUtils.getRequestUrl();
        final String page = HttpRequestResponseUtils.getRequestUri();
        final String refererPage = HttpRequestResponseUtils.getRefererPage();
        final String queryString = HttpRequestResponseUtils.getPageQueryString();
        final String userAgent = HttpRequestResponseUtils.getUserAgent();
        final String requestMethod = HttpRequestResponseUtils.getRequestMethod();
        final LocalDateTime timestamp = LocalDateTime.now();

        Visitor visitor = new Visitor();
        visitor.setUser(HttpRequestResponseUtils.getLoggedInUser());
        visitor.setIp(ip);
        visitor.setMethod(requestMethod);
        visitor.setUrl(url);
        visitor.setPage(page);
        visitor.setQueryString(queryString);
        visitor.setRefererPage(refererPage);
        visitor.setUserAgent(userAgent);
        visitor.setLoggedTime(timestamp);
        visitor.setUniqueVisit(true);

        visitorService.saveVisitorInfo(visitor);

        return true;
    }
}
