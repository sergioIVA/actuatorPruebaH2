package com.com.ceiba.actuatorBD;

import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.actuate.jdbc.DataSourceHealthIndicator;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/estado")
public class Mycontroller {
	
	
	@ReadOperation
	@GetMapping
	public ResponseEntity<Persona>  listarPuestos() {
		
		
DataSourceHealthIndicator indicator = new DataSourceHealthIndicator();
		
		SingleConnectionDataSource dataSource;
        EmbeddedDatabaseConnection db = EmbeddedDatabaseConnection.H2;
	    dataSource = new SingleConnectionDataSource("jdbc:h2:mem:testdb", "sa", "", false);
		dataSource.setDriverClassName(db.getDriverClassName());
	    new JdbcTemplate(dataSource).execute("CREATE TABLE SERGIO (id INTEGER IDENTITY PRIMARY KEY)");
	    new JdbcTemplate(dataSource).execute("insert into SERGIO values (1)");
			
			String customValidationQuery = "SELECT COUNT(*) from SERGIO";
			//String customValidationQuery="select * SERGIO where id=1";
			
			
			indicator.setDataSource(dataSource);
			indicator.setQuery(customValidationQuery);
			Health health = indicator.health();
			
			
			System.out.println(health.getStatus());
			
			
			      if(health.getStatus().equals(Status.UP)) {
			    	  
			    	  System.out.println(health.getDetails());
			    
			  		return new ResponseEntity<>(null, HttpStatus.OK); //
			      }
			 
			System.out.println(health.getDetails());
			
		return null ;  //ok
	}

}
