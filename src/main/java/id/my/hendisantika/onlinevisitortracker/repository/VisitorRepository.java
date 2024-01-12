package id.my.hendisantika.onlinevisitortracker.repository;

import id.my.hendisantika.onlinevisitortracker.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-online-visitor-tracker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/13/24
 * Time: 06:15
 * To change this template use File | Settings | File Templates.
 */
public interface VisitorRepository extends JpaRepository<Visitor, Integer> {
}
