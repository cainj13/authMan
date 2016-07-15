package com.redhat.it;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

@ApplicationPath("/rest")
public class AuthManApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Collections.<Class<?>>singleton(HelloWorld.class);
    }
}
