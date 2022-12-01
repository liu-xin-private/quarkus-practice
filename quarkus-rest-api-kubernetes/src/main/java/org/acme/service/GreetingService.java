package org.acme.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped //@Service
public class GreetingService {

    public String greeting(String name) {
        return "hello1 " + name;
    }

}
