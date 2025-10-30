package model;

public class NewsArticle {
    private String title;
    private String text;

    public NewsArticle(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }
}