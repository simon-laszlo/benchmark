package benchmark.openjdk_spring;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomerServlet extends HttpServlet {
	
	@Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ObjectMapper objectMapper;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final var customers = customerRepository.findAll();
		final var content = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(customers);
		resp.setHeader("Content-Length", String.valueOf(content.length()));
		resp.setHeader("Connection", null);
		resp.getWriter().write(content);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
