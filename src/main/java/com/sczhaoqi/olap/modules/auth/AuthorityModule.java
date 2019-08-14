package com.sczhaoqi.olap.modules.auth;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sczhaoqi.olap.config.AuthorityConfig;
import com.sczhaoqi.olap.resources.AuthorityResource;

import static io.airlift.configuration.ConfigBinder.configBinder;
import static io.airlift.http.client.HttpClientBinder.httpClientBinder;
import static io.airlift.jaxrs.JaxrsBinder.jaxrsBinder;
import static io.airlift.json.JsonCodecBinder.jsonCodecBinder;

/**
 * @author sczhaoqi
 * @date 2019/8/14 22:26
 */
public class AuthorityModule
        implements Module
{
    public void configure(Binder binder)
    {
        configBinder(binder).bindConfig(AuthorityConfig.class);

        httpClientBinder(binder).bindHttpClient("authority", ForAuthority.class);

        jaxrsBinder(binder).bind(AuthorityResource.class);
        jsonCodecBinder(binder).bindJsonCodec(HelloInfo.class);
    }
}
