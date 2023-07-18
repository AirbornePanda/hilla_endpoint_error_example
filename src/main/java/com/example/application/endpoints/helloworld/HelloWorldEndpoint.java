package com.example.application.endpoints.helloworld;

import com.example.application.entities.ExampleEntity;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

@Endpoint
@AnonymousAllowed
public class HelloWorldEndpoint {

    @Nonnull
    public String sayHello(@Nonnull ExampleEntity id) {
        if (id == null) {
            return "Hello stranger";
        } else {
            return "Id is " + id;
        }
    }
}