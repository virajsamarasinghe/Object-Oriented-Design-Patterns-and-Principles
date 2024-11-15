package viraj.com.observerPattern;

public class Main {
    public static void main(String[] args) {
        // Create Subject (Blog)
        Blog techBlog = new Blog();

        // Create Observers (Subscribers)
        Observer john = new Subscriber("John");
        Observer jane = new Subscriber("Jane");

        // Register Observers
        techBlog.registerObserver(john);
        techBlog.registerObserver(jane);

        // Publish a new article
        techBlog.publishArticle("Observer Pattern in Java"); // Notify all subscribers

        // Remove an Observer
        techBlog.removeObserver(john);

        // Publish another article
        techBlog.publishArticle("Simplified Design Patterns"); // Notify remaining subscribers
    }
}