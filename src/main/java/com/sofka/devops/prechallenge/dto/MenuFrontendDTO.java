package com.sofka.devops.prechallenge.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class MenuFrontendDTO {

    private String id;
    @NotBlank(message = "name must not be empty")
    private String name;
    @NotBlank(message = "description must not be empty")
    private String description;
    @NotBlank(message = "company must not be empty")
    private String company;
}
