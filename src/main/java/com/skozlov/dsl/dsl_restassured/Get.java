package com.skozlov.dsl.dsl_restassured;

public class Get {
    
    private String uri;
    private String method;
    private String assertBodyParam;
    private String assertBodyValue;
    
    
    public void setUri(String uri) {
        this.uri = uri;
    }
    
    public String getUri() {
        return uri;
    }
    
    public void setMethod(String method) {
        this.method = method;
    }
    
    public String getMetod() {
        return method;
    }
    
    public void setAssertBodyParam(String assertBodyParam) {
        this.assertBodyParam = assertBodyParam;
    }
    
    public String getAssertBodyParam() {
        return assertBodyParam;
    }
    
    public void setAssertBodyValue(String assertBodyValue) {
        this.assertBodyValue = assertBodyValue;
    }
    
    public String getAssertBodyValue() {
        return assertBodyValue;
    }

}
