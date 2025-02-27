package com.dvtsoftware.cardapi.service;

import com.dvtsoftware.cardapi.model.CardTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LambdaCaller {

    @Autowired
    private RestTemplate restTemplate;

    public boolean sendRequest(CardTransaction cardTransaction){
        System.out.println("Sending request: " + cardTransaction);
        var response =  restTemplate.postForObject("https://qcs7khyahouzpbpgf4fvqyl2cq0wlejz.lambda-url.us-east-1.on.aws/",cardTransaction,Boolean.class);
        return response;
    }

}
