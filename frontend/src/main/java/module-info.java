module frontend {
    requires jdk.httpserver;
    requires jersey.common;
    requires jersey.server;
    requires jersey.container.jdk.http;
    requires java.ws.rs;
    requires java.json.bind;
    requires backend;

    exports jtechlog.frontend to jersey.server, hk2.locator;
    uses jtechlog.backend.BookmarkService;
}