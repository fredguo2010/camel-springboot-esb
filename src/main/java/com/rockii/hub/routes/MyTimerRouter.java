package com.rockii.hub.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyTimerRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        // timer
        from("timer:first-timer")
                .transform().constant("richard")
                .to("log:first-timer");
    }
}
