package com.johnmedlock.spring.basics.springin5steps;

import com.johnmedlock.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import com.johnmedlock.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info(someCDIBusiness.getSomeCDIDAO().toString());

    }

}
