package viraj.com.observerPattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
class Blog implements Subject {
    private List<Observer> subscribers; // List to store subscribers
    private String latestArticle;

    public Blog() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestArticle);
        }
    }

    // Publish a new article
    public void publishArticle(String article) {
        this.latestArticle = article;
        notifyObservers(); // Notify all subscribers
    }
}
