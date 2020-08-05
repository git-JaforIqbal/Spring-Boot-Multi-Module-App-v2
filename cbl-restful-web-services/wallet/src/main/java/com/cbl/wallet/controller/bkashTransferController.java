package com.cbl.wallet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/secure/rest/v1")
public class bkashTransferController {

    @RequestMapping(value = "/getCustomerKyc", method = RequestMethod.GET)
    public List<String> getProducts() {
        List<String> productsList = new ArrayList<>();
        productsList.add("Honey");
        productsList.add("Almond");
        return productsList;
    }

    @RequestMapping(value = "/doBkashTransfer", method = RequestMethod.POST)
    public String createProduct() {
        return "Product is saved successfully";
    }
}
