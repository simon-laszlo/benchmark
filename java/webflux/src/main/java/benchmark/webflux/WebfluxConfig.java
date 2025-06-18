package benchmark.webflux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.RequiredArgsConstructor;

@Configuration(proxyBeanMethods = false)
@EnableWebFlux
@EnableReactiveMongoRepositories(basePackages = "benchmark.webflux")
@RequiredArgsConstructor
public class WebfluxConfig {

	private final CustomersRepository customersRepository;

	@Bean
	RouterFunction<ServerResponse> getCustomers() {
		return RouterFunctions.route()
				.GET("/customers", req -> ServerResponse.ok().body(customersRepository.findAll(), Customers.class))
				.build();
	}

	@Bean
	RouterFunction<ServerResponse> setCustomers() {
		return RouterFunctions.route().POST("/customers", req ->
		req.bodyToMono(Customers.class)
		   .flatMap(customersRepository::save)
		   .then(ServerResponse.ok().bodyValue("ok"))).build();
	}
}
