package com.springmongo.springmongo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection ="Smartphone")
public class Smartphone{
    @Id
    private int id;
    private String  name;
    private int ram;

}
