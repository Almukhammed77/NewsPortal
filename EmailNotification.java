package strategy;

import model.NewsArticle;

public class EmailNotification implements NotificationStrategy {
    @Override
    public void send(String userName, NewsArticle article) {
        System.out.println("email to " + userName + " new email:" + article.getTitle());
    }
}
