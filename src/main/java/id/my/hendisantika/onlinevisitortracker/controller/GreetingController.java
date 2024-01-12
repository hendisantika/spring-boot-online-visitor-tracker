package id.my.hendisantika.onlinevisitortracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-online-visitor-tracker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/13/24
 * Time: 06:25
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class GreetingController {
    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Welcome to User Activity Logging", HttpStatus.OK);
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> greet(@PathVariable String name) {
        return new ResponseEntity<>("Hello, " + name, HttpStatus.OK);
    }
}
