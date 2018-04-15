package jtechlog.frontend;

import jtechlog.backend.Bookmark;
import jtechlog.backend.BookmarkService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

@Path("bookmarks")
public class BookmarkResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bookmark> bookmarks() {
        // return new BookmarkServiceImpl().listBookmarks();
        System.out.println("List bookmarks");
        return getBookmarkService().listBookmarks();
    }

    @POST
    public void addBookmark(Bookmark bookmark) {
        System.out.println("Add bookmark");
        getBookmarkService().addBookmark(bookmark);
    }

    private BookmarkService getBookmarkService() {
        ServiceLoader<BookmarkService> bookmarkServices = ServiceLoader.load(BookmarkService.class);
        Iterator<BookmarkService> i = bookmarkServices.iterator();
        if (i.hasNext()) {
            return i.next();
        }
        else {
            throw new IllegalStateException("Service not found");
        }
    }
}
