package id.my.hendisantika.onlinevisitortracker.service;

import id.my.hendisantika.onlinevisitortracker.entity.Visitor;
import id.my.hendisantika.onlinevisitortracker.repository.VisitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-online-visitor-tracker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/13/24
 * Time: 06:16
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class VisitorService {

    private final VisitorRepository repository;

    public Visitor saveVisitorInfo(Visitor visitor) {
        return repository.save(visitor);
    }
}
