package com.dominguezrosales;

import java.util.*;

import com.dominguezrosales.config.FunctionConfiguration;
import com.dominguezrosales.dto.PersonDto;
import com.dominguezrosales.service.PersonService;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Azure Functions with HTTP Trigger.
 */
@Slf4j
public class HttpTriggerJava {

    @FunctionName("HttpTriggerJava")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");
        log.info("Java HTTP trigger processed a request.");
        ConfigurableApplicationContext ctx = FunctionConfiguration.getContext(context);
        PersonService personService = ctx.getBean(PersonService.class);
        List<PersonDto>  listPersons = personService.getAllPersons();
        log.info("Getting all persons - HttpTriggerJava");
        return request.createResponseBuilder(HttpStatus.OK).body(listPersons).build();

    }
}
