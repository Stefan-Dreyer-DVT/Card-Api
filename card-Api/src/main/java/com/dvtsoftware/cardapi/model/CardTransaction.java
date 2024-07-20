package com.dvtsoftware.cardapi.model;// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardTransaction {

    public String accountNumber;
    public Date dateTime;
    public int centsAmount;
    public String currencyCode;
    public String type;
    public String reference;
    public Card card;
    public Merchant merchant;
}

