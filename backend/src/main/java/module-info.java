module backend {
    exports jtechlog.backend to frontend, hk2.locator, jackson.databind;
    provides jtechlog.backend.BookmarkService with jtechlog.backend.impl.BookmarkServiceImpl;
}