package id.my.hendisantika.onlinevisitortracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-online-visitor-tracker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/13/24
 * Time: 06:23
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class SecurityConfig {

    private static final String PASSWORD_ENCODED = "$2a$10$B18wGZhRjNau6ZBcI/NBQO6EEdJ7GyVvjjWfAK20ODz4B6LmXicRa";// roy

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http.headers()
                .frameOptions().sameOrigin()
                .and()
                .authorizeRequests()
                .requestMatchers("/", "/hello/**", "/h2console/**").permitAll().anyRequest().authenticated().and()
                .httpBasic();
        http.csrf().disable();
        http.headers().frameOptions().disable();
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("naruto")
                .password(PASSWORD_ENCODED)
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
