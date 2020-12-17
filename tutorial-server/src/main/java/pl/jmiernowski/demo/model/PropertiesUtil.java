package pl.jmiernowski.demo.model;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class PropertiesUtil {
    @Value("${server.port}")
    private String serverPort;
}
