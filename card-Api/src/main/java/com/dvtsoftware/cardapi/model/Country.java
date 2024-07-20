package com.dvtsoftware.cardapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Country {

    public String code;
    public String alpha3;
    public String name;
}