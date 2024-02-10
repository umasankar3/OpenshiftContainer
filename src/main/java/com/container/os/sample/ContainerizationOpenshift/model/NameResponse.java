package com.container.os.sample.ContainerizationOpenshift.model;

import lombok.*;

@Getter
@Setter
@Builder
public class NameResponse {

    private String name;
    private String fullname;
    private String version;
}
