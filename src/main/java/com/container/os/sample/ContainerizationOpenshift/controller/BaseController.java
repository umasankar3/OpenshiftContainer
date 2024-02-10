package com.container.os.sample.ContainerizationOpenshift.controller;

import com.container.os.sample.ContainerizationOpenshift.model.NameResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RequiredArgsConstructor
@RestController
@RequestMapping("/openshift/cont/api")
public class BaseController {

    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @GetMapping("/name/{name}")
    public ResponseEntity<NameResponse> getName(@PathVariable String name){
        logger.info("In Controller");
        NameResponse response = NameResponse.builder()
                .name(name).build();
        return ResponseEntity.ok().body(response);
    }
}
