package com.com.ceiba.actuatorBD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.actuate.jdbc.DataSourceHealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@SpringBootApplication
public class ProyectoH2ActuatorApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ProyectoH2ActuatorApplication.class, args);
		
		
		
	
	}

}
