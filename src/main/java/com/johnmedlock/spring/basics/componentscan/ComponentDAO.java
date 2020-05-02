package com.johnmedlock.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {
    @Autowired
    ComponentConnection componentConnection;

    public ComponentConnection getComponentConnection() {
        return componentConnection;
    }

    public void setComponentJdbcConnection(ComponentConnection componentConnection) {
        this.componentConnection = componentConnection;
    }
}
