package com.dvtsoftware.cardapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Merchant {

    public Category category;
    public String name;
    public String city;
    public Country country;
}