package com.lei.learn.sprintBoot.config;


import com.lei.learn.sprintBoot.repo.ReaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private ReaderRepository readerRepository;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").access("hasRole('READER')")
                .antMatchers("/**").permitAll();
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(new UserDetailsService() {
//            @Override
//            public UserDetails loadUserByUsername(String username)
//                    throws UsernameNotFoundException {
////                UserDetails userDetails = readerRepository.findOne(username);
//                if (userDetails != null) {
//                    return userDetails;
//                }
//                throw new UsernameNotFoundException("User '" + username + "' not found.");
//            }
//        });
//    }
}
