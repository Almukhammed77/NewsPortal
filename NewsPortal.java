package portal;

import model.NewsArticle;
import user.User;
import java.util.ArrayList;
import java.util.List;

public class NewsPortal {
    private String name;
    private List<User> subscribers = new ArrayList<>();

    public NewsPortal(String name) {
        this.name = name;
    }

    public void addSubscriber(User user) {
        subscribers.add(user);
        System.out.println(user.getName() + " subscribed to " + name + " news");
    }

    public void removeSubscriber(User user) {
        subscribers.remove(user);
    }

    public void addArticle(NewsArticle article) {
        System.out.println();
        System.out.println("--" + name + "-- new article " + article.getTitle());
        notifySubscribers(article);
    }

    private void notifySubscribers(NewsArticle article) {
        for (User user : subscribers) {
            user.update(article);
        }
    }
}