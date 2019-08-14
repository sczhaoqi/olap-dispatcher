package com.sczhaoqi.olap.resources;

import com.sczhaoqi.olap.config.AuthorityConfig;
import com.sczhaoqi.olap.modules.auth.HelloInfo;
import io.airlift.log.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

/**
 * @author sczhaoqi
 * @date 2019/8/14 23:11
 */
@Path("/")
public class AuthorityResource
{
    private static final Logger log = Logger.get(AuthorityResource.class);
    private final AuthorityConfig config;

    @Inject
    public AuthorityResource(AuthorityConfig config)
    {
        this.config = requireNonNull(config, "authorityConfig is nul");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HelloInfo hello()
    {
        return new HelloInfo("kitty");
    }
}
