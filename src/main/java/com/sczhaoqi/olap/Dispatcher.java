package com.sczhaoqi.olap;

import com.google.common.collect.ImmutableList;
import com.google.inject.Module;
import com.sczhaoqi.olap.modules.auth.AuthorityModule;
import io.airlift.bootstrap.Bootstrap;
import io.airlift.event.client.EventModule;
import io.airlift.http.server.HttpServerModule;
import io.airlift.jaxrs.JaxrsModule;
import io.airlift.jmx.JmxModule;
import io.airlift.json.JsonModule;
import io.airlift.log.LogJmxModule;
import io.airlift.log.Logger;
import io.airlift.node.NodeModule;
import io.airlift.tracetoken.TraceTokenModule;
import org.weakref.jmx.guice.MBeanModule;

/**
 * @author sczhaoqi
 * @date 2019/8/14 22:23
 */
public final class Dispatcher
{
    private Dispatcher(){

    }
    public static void start(Module... extraModules)
    {
        Bootstrap app = new Bootstrap(ImmutableList.<Module>builder()
                .add(new NodeModule())
                .add(new HttpServerModule())
                .add(new JsonModule())
                .add(new JaxrsModule())
                .add(new MBeanModule())
                .add(new JmxModule())
                .add(new LogJmxModule())
                .add(new TraceTokenModule())
                .add(new EventModule())
                .add(new AuthorityModule())
                .add(extraModules)
                .build());

        Logger log = Logger.get(Dispatcher.class);
        try {
            app.strictConfig().initialize();
            log.info("======== SERVER STARTED ========");
        }
        catch (Throwable t) {
            log.error(t);
            System.exit(1);
        }
    }

    public static void main(String[] args)
    {
        start();
    }
}
