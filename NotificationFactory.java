package strategy;

public class NotificationFactory {
    public static NotificationStrategy create(String type) {
        if (type.equalsIgnoreCase("email"))
            return new EmailNotification();
        else if (type.equalsIgnoreCase("sms"))
            return new SmsNotification();
        else
            return new PushNotification();
    }
}