package com.examples;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Created by ka40215 on 2/3/16.
 */
public class Client implements BundleActivator {
    public void start(BundleContext ctx) {
        ServiceReference ref =
                ctx.getServiceReference(Greeting.class.getName());
        ((Greeting) ctx.getService(ref)).sayHello();
    }

    public void stop(BundleContext ctx) {}

}

