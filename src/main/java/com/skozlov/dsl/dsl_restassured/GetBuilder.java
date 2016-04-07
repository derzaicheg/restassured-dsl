package com.skozlov.dsl.dsl_restassured;

import static org.hamcrest.Matchers.equalTo;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;

public class GetBuilder {

    private Get get;

    public GetBuilder() {
        get = new Get();
    }

    public static GetBuilder Get() {
        return new GetBuilder();
    }

    public void setUri(String uri) {
        get.setUri(uri);
    }

    public void setMethod(String method) {
        get.setMethod(method);
    }

    public void responseBodyShouldContain(String param, String value) {
        get.setAssertBodyParam(param);
        get.setAssertBodyValue(value);
    }

    public void send() {
        RestAssured.baseURI = get.getUri();
        RestAssured.given().filter(ResponseLoggingFilter.logResponseIfStatusCodeIs(200)).get(get.getMetod()).then()
                .assertThat().body(get.getAssertBodyParam(), equalTo(get.getAssertBodyValue()));
    }

}
