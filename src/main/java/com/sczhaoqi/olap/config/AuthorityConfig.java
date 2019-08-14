package com.sczhaoqi.olap.config;

import io.airlift.configuration.Config;
import io.airlift.configuration.ConfigDescription;

import javax.validation.constraints.NotNull;

/**
 * @author sczhaoqi
 * @date 2019/8/14 23:11
 */
public class AuthorityConfig
{
    private String authorityType;

    @NotNull
    public String getAuthorityType()
    {
        return authorityType;
    }

    @Config("authority.type")
    @ConfigDescription("Type to check user's privilege")
    public AuthorityConfig setAuthorityType(String authorityType)
    {
        this.authorityType = authorityType;
        return this;
    }
}
