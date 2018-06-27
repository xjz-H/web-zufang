package com.pibigstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ZufangApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZufangApplication.class, args);
	}
}
