package com.example.application.endpoints.helloworld;

import com.example.application.entities.ExampleEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

@Endpoint
@AnonymousAllowed
public class HelloWorldEndpoint extends BaseEndpoint<String>{

    @JsonIgnore
    public String test;

    @JsonProperty("jesus")
    public String test2;


}