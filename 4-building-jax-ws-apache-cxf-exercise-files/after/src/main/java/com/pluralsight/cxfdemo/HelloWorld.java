package com.pluralsight.cxfdemo;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

