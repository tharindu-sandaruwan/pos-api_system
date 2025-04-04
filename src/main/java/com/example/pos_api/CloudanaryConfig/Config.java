package com.example.pos_api.CloudanaryConfig;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

    private final String CLOUD_NAME = "ddv4hk4df";
    private final String API_KEY = "932942772111539";
    private final String API_SECRET = "lDtyK4p4mFdzogU1BNvUwHYx9Vs";

    @Bean
    public Cloudinary cloudinary(){
        Map<String,String> config = new HashMap<>();
        config.put("cloud_name",CLOUD_NAME);
        config.put("api_key",API_KEY);
        config.put("api_secret",API_SECRET);

        return new Cloudinary(config);
    }

}
