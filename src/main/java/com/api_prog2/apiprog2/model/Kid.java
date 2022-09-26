package com.api_prog2.apiprog2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Kid {
    private String identification;
    private String name;
    private byte age;
    private char gender;

}
