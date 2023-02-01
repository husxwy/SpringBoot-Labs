package com.hero.web.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

public class WebServerConfig implements WebServerFactoryCustomizer<ConfigurableWebServerFactory>  {
  public WebServerConfig() {
  }

  public void customize(ConfigurableWebServerFactory configurableWebServerFactory) {
    ((TomcatServletWebServerFactory)configurableWebServerFactory).addConnectorCustomizers(new TomcatConnectorCustomizer[]{new TomcatConnectorCustomizer() {
      public void customize(Connector connector) {
        Http11NioProtocol protocol = (Http11NioProtocol)connector.getProtocolHandler();
        protocol.setKeepAliveTimeout(30000);
        protocol.setMaxKeepAliveRequests(10000);
      }
    }});
  }
}
