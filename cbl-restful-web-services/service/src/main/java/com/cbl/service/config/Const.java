package com.cbl.service.config;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Const {

    public static final String TIME_STAMP = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss").format(new Date());

    //Response format tag
    public static final String RESPONSE_TIMESTAMP="timestamp";
    public static final String RESPONSE_CODE="code";
    public static final String RESPONSE_STATUS="status";
    public static final String RESPONSE_DATA="data";
    public static final String SUCCESS_CODE = "200";


}
