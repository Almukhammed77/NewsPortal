package user;

import model.NewsArticle;
import strategy.NotificationStrategy;

public class User {
    private String name;
    private NotificationStrategy strategy;

    public User(String name, NotificationStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void update(NewsArticle article) {
        System.out.println("user " + name + " received a notification");
        strategy.send(name, article);
    }
}