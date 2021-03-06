package com.vipas.gquendelibray.configs;

import com.vipas.gquendelibray.repository.BookRepository;
import com.vipas.gquendelibray.repository.UserRepository;
import com.vipas.gquendelibray.services.SSUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.persistence.EntityManagerFactory;


@Configuration
@EnableWebSecurity
@EnableConfigurationProperties({FileStorageProperties.class})
//@EnableAutoConfiguration(
//        exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Configurations extends WebSecurityConfigurerAdapter {

//    BookRepository bookRepository;

//    @Autowired
//    EntityManagerFactory entityManagerFactory;

//    @Autowired
//    private SSUserDetailsService userDetailsService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;




    @Bean
    public static BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        super.configure(http);
//        http.authorizeRequests()
//        http.authorizeRequests()
//                .antMatchers("/").access("hasAnyAuthority('USERS','ADMIN')")
//                .antMatchers("/admin").access("hasAnyAuthority('ADMIN')")
//                .anyRequest().authenticated().and().formLogin().loginPage("/login")
//                .permitAll().and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/home").permitAll();

        http.authorizeRequests().anyRequest().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

//auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("1234"))
//        .authorities("ADMIN").and().withUser("admin")
//        .password(passwordEncoder().encode("admin")).authorities("USER");

//auth.userDetailsService(new SSUserDetailsService(userRepository)).passwordEncoder(passwordEncoder());

    }


}