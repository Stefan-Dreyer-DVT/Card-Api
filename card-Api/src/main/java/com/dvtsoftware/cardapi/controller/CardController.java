package com.dvtsoftware.cardapi.controller;

import com.dvtsoftware.cardapi.model.CardTransaction;
import com.dvtsoftware.cardapi.service.LambdaCaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController()
public class CardController {

    @Autowired
    LambdaCaller lambdaCaller;

    @PostMapping("/auth")
    public boolean auth(@RequestBody CardTransaction cardTransaction) {
        return lambdaCaller.sendRequest(cardTransaction);
    }

    @GetMapping("/test")
    public ResponseEntity<CardTransaction> test() {
        var cardTransaction = new CardTransaction();
        cardTransaction.setType("card");
        return ResponseEntity.ok(cardTransaction);
    }

}
