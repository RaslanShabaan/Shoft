package com.arch;

import javax.sql.DataSource;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity

public class Security_Config extends WebSecurityConfigurerAdapter {


	 @Autowired
	 DataSource dataSource;

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                // enable pages and web services 
                .antMatchers("/GoRegister","/RestPosts/**","/Register","/Login","/Check").permitAll()
               // enable Styles  
                .antMatchers("/css/**","/scss/**","/js/**","/img/**","/images/**").permitAll()
                
                
               	.antMatchers("/**").hasAnyRole("USER","ADMIN")
                    .anyRequest().authenticated()
                    .and()
                .formLogin() 
                
                
                
                .loginPage("/Login")
                    .loginProcessingUrl("/Login").usernameParameter("username").passwordParameter("password").
                    defaultSuccessUrl("/" ,true)
                    .permitAll()
                    .and()
                    
    
                    
        .logout().deleteCookies("remember-me").logoutSuccessUrl("/Logout") 
        .permitAll().and().rememberMe().tokenValiditySeconds(120).and().csrf();

	}

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	// ************ memory ********************

//		    	auth.inMemoryAuthentication()
//        .withUser("user").password("p").roles("USER")
//        .and();
//	
		    	 
    	 auth.jdbcAuthentication().dataSource(dataSource).
    	 passwordEncoder(passwordencoder())
    	 .usersByUsernameQuery(
    	   "select username,password,enabled from users where username=?")
    	  .authoritiesByUsernameQuery(
    	   "select username,authority from authorities where username=?");
    	 
       }
    	
  
    	    	   @Bean(name="passwordEncoder")
    	    public Md5PasswordEncoder passwordencoder(){
    	    	return new Md5PasswordEncoder();	
    	   }
    
}