package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@RestController
public class HealthCheckController {
    @RequestMapping("version")
    public String getVersion() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties");
        properties.load(inputStream);
        return properties.getProperty("build.name") + " - " + properties.getProperty("build.version");
    }

}
