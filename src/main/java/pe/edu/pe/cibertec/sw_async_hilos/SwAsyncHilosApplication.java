package pe.edu.pe.cibertec.sw_async_hilos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync // te permite trabajar con tareas asincronas
public class SwAsyncHilosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwAsyncHilosApplication.class, args);
	}

}
