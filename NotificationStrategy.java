package strategy;

import model.NewsArticle;

public interface NotificationStrategy {
    void send(String userName, NewsArticle article);
}