package pe.edu.ceid.simi.management;

import org.apache.log4j.LogManager;

//import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
//	private static final Logger logger = LogManager.getLogger("sera :c");
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Entro al Modulo Administrative");
	}

	
}//P
