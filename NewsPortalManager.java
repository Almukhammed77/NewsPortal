package management;

import portal.NewsPortal;
import java.util.HashMap;

public class NewsPortalManager {
    private static NewsPortalManager instance;
    private HashMap<String, NewsPortal > portals = new HashMap<>();

    private NewsPortalManager() {}

    public static NewsPortalManager getInstance() {
        if (instance == null) {
            instance = new NewsPortalManager();
        }
        return instance;
    }

    public NewsPortal createPortal(String name) {
        NewsPortal portal = new NewsPortal(name);
        portals.put(name, portal);
        return portal;
    }
}