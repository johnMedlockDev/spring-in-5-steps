package com.johnmedlock.spring.basics.springin5steps;

import com.johnmedlock.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.johnmedlock.spring.basics.springin5steps")
public class SpringIn5StepsScopeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

        LOGGER.info(personDAO.toString());
        LOGGER.info(personDAO.getJdbcConnection().toString());

        LOGGER.info(personDAO2.toString());
        LOGGER.info(personDAO2.getJdbcConnection().toString());

        applicationContext.close();

    }

}
