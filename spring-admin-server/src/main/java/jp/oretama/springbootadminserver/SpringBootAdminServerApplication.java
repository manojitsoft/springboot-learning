package jp.oretama.springbootadminserver;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootAdminServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootAdminServerApplication.class)
        .web(WebApplicationType.REACTIVE)
        .run(args);
	}
}
