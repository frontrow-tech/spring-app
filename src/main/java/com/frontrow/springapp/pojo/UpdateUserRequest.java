package com.frontrow.springapp.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequest {

    @NotNull
    private Long id;

    private String name;

    private String email;
}
