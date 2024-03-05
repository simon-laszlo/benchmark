package benchmark.openjdk_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Servlet {
	
	@Autowired
	private CustomerServlet servlet;

    @Bean
    public ServletRegistrationBean<CustomerServlet> genericCustomServlet() {
        ServletRegistrationBean<CustomerServlet> bean = new ServletRegistrationBean<>(servlet, "/customers_vt/*");
        bean.setLoadOnStartup(1);
        return bean;
    }
}