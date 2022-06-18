package com.springboot.instagramCopy2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity // 해당파일로 시큐리티를 활성화시킬 것이다.
@Configuration  // 설정에 관련있는 객체들을 IoC 등록할 때 사용
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	// 내가 사용할 수 있도록 재정의를 해주어야한다.
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
			.antMatchers("/", "/index", "/user/**","/login")
			.authenticated()
			.anyRequest()
			.permitAll()
			.and()
			.formLogin()
			.loginPage("/auth/signin") // GET 요청 : 처음 화면을 띄울 때
			.loginProcessingUrl("/auth/signin") // POST 요청 : submit 요청을 날릴 떄 POST 요청으로 날릴 것이다.
			.defaultSuccessUrl("/"); // 로그인 성공시에 이동할 페이지
			
	}

}
