package com.example.application.endpoints.helloworld;


import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;

@Endpoint
@AnonymousAllowed
public class SecondEndpoint extends BaseEndpoint<Long>{
}
