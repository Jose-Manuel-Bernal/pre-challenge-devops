package com.sofka.devops.prechallenge.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "menu-devops")
public class MenuDevOps {

    @Id
    private String id;
    private String name;
    private String description;
    private String company;
}
