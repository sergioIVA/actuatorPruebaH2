package com.com.ceiba.actuatorBD;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomHealthIndicator extends AbstractHealthIndicator {

	
	@Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        // Use the builder to build the health status details that should be reported.
        // If you throw an exception, the status will be DOWN with the exception message.
        
		//builder.down().withDetail("erro:","No se puede conectar con el servicio de mysql");
        builder.up()
                .withDetail("La conexion ", "La conexion con la base de datos es correcta");
                
    }
}
