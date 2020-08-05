package com.cbl.service.api.response;

import com.cbl.service.config.Const;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//@ComponentScan(basePackages = "com.cbl.*")
@Service
public class ServiceHelper {

    public ResponseEntity<Object> successResponseHandler(String RESPONSE_CODE, HttpStatus httpStatus, List<Object> dataset) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put(Const.RESPONSE_TIMESTAMP, Const.TIME_STAMP);
        body.put(Const.RESPONSE_CODE, RESPONSE_CODE);
        body.put(Const.RESPONSE_STATUS, httpStatus);
        body.put(Const.RESPONSE_DATA, dataset);
        return new ResponseEntity<>(body, httpStatus);
    }

    public ResponseEntity<Object> successResponseHandler(String RESPONSE_CODE, HttpStatus httpStatus, String dataset) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put(Const.RESPONSE_TIMESTAMP, Const.TIME_STAMP);
        body.put(Const.RESPONSE_CODE, RESPONSE_CODE);
        body.put(Const.RESPONSE_STATUS, httpStatus);
        body.put(Const.RESPONSE_DATA, dataset);
        return new ResponseEntity<>(body, httpStatus);
    }
}
