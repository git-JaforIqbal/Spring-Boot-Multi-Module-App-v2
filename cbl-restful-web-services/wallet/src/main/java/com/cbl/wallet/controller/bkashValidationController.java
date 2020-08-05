package com.cbl.wallet.controller;

import com.cbl.service.api.response.ServiceHelper;
import com.cbl.service.config.Const;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bkashValidationController {
    protected ServiceHelper serviceHelper;

    @RequestMapping(value = "/bKashCustomerValidation", method = RequestMethod.POST)
    public ResponseEntity<Object> bKashCustomerValidation() {
        return serviceHelper.successResponseHandler(Const.SUCCESS_CODE, HttpStatus.OK, "");
    }
}
