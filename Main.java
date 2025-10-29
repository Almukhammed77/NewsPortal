import management.NewsPortalManager;
import model.NewsArticle;
import portal.NewsPortal;
import strategy.NotificationFactory;
import user.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("News Portal");

        NewsPortalManager manager = NewsPortalManager.getInstance();

        NewsPortal tech = manager.createPortal("Technology");
        NewsPortal sport = manager.createPortal("Sports");

        User anna = new User("Arman", NotificationFactory.create("email"));
        User petr = new User("Aset", NotificationFactory.create("sms"));
        User ali = new User("Ali", NotificationFactory.create("push"));

        tech.addSubscriber(anna);
        tech.addSubscriber(ali);
        sport.addSubscriber(petr);

        tech.addArticle(new NewsArticle("AI breakthrough!", "New model beats human level."));
        sport.addArticle(new NewsArticle("Football match", "Kazakhstan wins 3:1!"));

        System.out.println("\nAnna changes notification method to SMS.\n");
        anna.setStrategy(NotificationFactory.create("sms"));

        tech.addArticle(new NewsArticle("Cybersecurity", "New virus detected!"));
    }
}