package com.web.cxf.webservice.impl;

/**
 * Created by huigou on 2019/6/23.
 */

import com.web.cxf.webservice.CXFWebService;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.web.cxf.webservice.CXFWebService",
        serviceName = "CXFWebService")
public class CXFWebServiceImpl implements CXFWebService {

    public String hello(@WebParam String text) {
        return "Hello " + text;
    }
}