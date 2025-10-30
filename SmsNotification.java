package strategy;

import model.NewsArticle;

public class SmsNotification implements NotificationStrategy {
    @Override
    public void send(String userName, NewsArticle article) {
        System.out.println("SMS to " + userName + " new SMS:" + article.getTitle());
    }
}