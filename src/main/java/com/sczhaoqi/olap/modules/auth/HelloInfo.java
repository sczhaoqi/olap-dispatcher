package com.sczhaoqi.olap.modules.auth;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author sczhaoqi
 * @date 2019/8/14 23:12
 */
public class HelloInfo
{
    private String message;

    @JsonCreator
    public HelloInfo(@JsonProperty("message") String message)
    {
        this.message = message;
    }

    @JsonProperty
    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
