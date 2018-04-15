package jtechlog.frontend;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class App extends ResourceConfig{

    public App() {
        packages("jtechlog");
    }

    public static void main(String[] args) {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(8080).build();
        ResourceConfig config = new App();
        HttpServer server = JdkHttpServerFactory.createHttpServer(baseUri, config);
    }
}
