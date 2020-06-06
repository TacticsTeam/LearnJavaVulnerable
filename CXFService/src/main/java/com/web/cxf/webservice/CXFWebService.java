package com.web.cxf.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by huigou on 2019/6/23.
 */
@WebService
public interface CXFWebService {
    String hello(@WebParam(name = "textname") String text);
}
