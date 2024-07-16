package com.nt.employe.Employe.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfig {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
