package com.example.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employer {

    private int id;
    private String name;
    private String surname;
    private Vacancy vacancy;

}
