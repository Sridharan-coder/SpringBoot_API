package com.e_commerce.Entry.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class ApplicationConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) {

		try {

//			http.csrf(customizer -> customizer.disable());
//			http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
////			http.formLogin(Customizer.withDefaults());
//			http.httpBasic(Customizer.withDefaults());
//			http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

//			return http.build();

			return http.csrf(customizer -> customizer.disable())
					.authorizeHttpRequests(request -> request.anyRequest().authenticated())
					.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults())
					.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
					.build();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
