package pl.jmiernowski.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import pl.jmiernowski.demo.model.PropertiesUtil;

@SpringBootApplication
public class RestMojaProbaApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RestMojaProbaApplication.class, args);
        PropertiesUtil bean = run.getBean(PropertiesUtil.class);
        System.out.println("http://localhost:" + bean.getServerPort());
    }



}
