package com.johnmedlock.spring.basics.springin5steps;

import com.johnmedlock.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.johnmedlock.spring.basics.springin5steps")
public class SpringIn5StepsComponentsApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentsApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentsApplication.class);        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info(componentDAO.toString());
        applicationContext.close();

    }

}
