package com.cbl.wallet.controller;

import com.cbl.service.api.response.ServiceHelper;
import com.cbl.service.config.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/secure/rest/v1")
public class bkashTransferController {

    @Autowired
    private ServiceHelper serviceHelper;

    @RequestMapping(value = "/getCustomerKyc", method = RequestMethod.GET)
    public ResponseEntity<Object>  getProducts() {
        return serviceHelper.successResponseHandler(Const.SUCCESS_CODE, HttpStatus.OK, "");
    }

    @RequestMapping(value = "/doBkashTransfer", method = RequestMethod.POST)
    public ResponseEntity<Object> doBkashTransfer() {
        return serviceHelper.successResponseHandler(Const.SUCCESS_CODE, HttpStatus.OK, "");
    }
}
