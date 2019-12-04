package br.com.alpis.saboreartedelivery;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.alpis")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SaboreArteDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaboreArteDeliveryApplication.class, args);
	}
	//Descomente para funcionar localmente
	/*@Bean
	public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("org.postgresql.Driver");
	    dataSource.setUrl("jdbc:postgresql://localhost/saboreartedb");
	    dataSource.setUsername( "postgres" );
	    dataSource.setPassword( "" );
	    return dataSource;
	}*/
}
