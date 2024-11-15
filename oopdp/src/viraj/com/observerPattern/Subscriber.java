package viraj.com.observerPattern;

// Concrete Observer
class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String article) {
        System.out.println(name + " received notification: New article published - " + article);
    }
}
