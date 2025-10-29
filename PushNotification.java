package strategy;

import model.NewsArticle;

public class PushNotification implements NotificationStrategy {
    @Override
    public void send(String userName, NewsArticle article) {
        System.out.println("Push to " + userName + ": " + article.getTitle());
    }
}