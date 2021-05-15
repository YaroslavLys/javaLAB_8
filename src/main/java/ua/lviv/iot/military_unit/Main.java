package ua.lviv.iot.military_unit;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import ua.lviv.iot.military_unit.rest.RestApplication;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

public class Main {

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/").port(8080).build();
    }

    static final URI BASE_URI = getBaseURI();

    static HttpServer startServer() {
        ResourceConfig rc = ResourceConfig.forApplication(new RestApplication());
        return GrizzlyHttpServerFactory.createHttpServer(BASE_URI, rc);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Starting ...");
        HttpServer httpServer = startServer();
        System.out.println("App started");
        System.out.println("Hit enter to stop it...");
        System.in.read();
        httpServer.shutdownNow();
    }
}
