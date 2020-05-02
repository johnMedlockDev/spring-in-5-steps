package com.johnmedlock.spring.basics.springin5steps;

import com.johnmedlock.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.johnmedlock.spring.basics.componentscan")
public class SpringIn5StepsComponentsApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentsApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentsApplication.class, args);
        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info(componentDAO.toString());

    }

}
