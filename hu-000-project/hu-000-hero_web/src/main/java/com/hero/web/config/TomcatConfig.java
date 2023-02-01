package com.hero.web.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11Nio2Protocol;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;

public class TomcatConfig extends TomcatServletWebServerFactory {
    public TomcatConfig() {
    }

    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
        };
        tomcat.addAdditionalTomcatConnectors(new Connector[]{this.http11Nio2Connector()});
        return tomcat;
    }

    public Connector http11Nio2Connector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11Nio2Protocol");
        Http11Nio2Protocol nio2Protocol = (Http11Nio2Protocol)connector.getProtocolHandler();
        nio2Protocol.setAcceptCount(1000);
        nio2Protocol.setMaxThreads(1000);
        nio2Protocol.setMaxConnections(20000);
        nio2Protocol.setKeepAliveTimeout(30000);
        nio2Protocol.setMaxKeepAliveRequests(10000);
        connector.setScheme("http");
        connector.setPort(9003);
        connector.setRedirectPort(8443);
        return connector;
    }
}



