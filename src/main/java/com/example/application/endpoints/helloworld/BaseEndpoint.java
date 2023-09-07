package com.example.application.endpoints.helloworld;

import com.example.application.entities.ExampleEntity;
import dev.hilla.EndpointExposed;
import dev.hilla.Nonnull;

@EndpointExposed
public abstract class BaseEndpoint<T> {

    public String getAll(T param) {
        return null;
    }

    @Nonnull
    public String sayHello(@Nonnull ExampleEntity id) {
        if (id == null) {
            return "Hello stranger";
        } else {
            return "Id is " + id;
        }
    }

}
