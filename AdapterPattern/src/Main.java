// Adapter Pattern Example in Java

// Target interface
interface Target {
    void request();
}

// Adaptee class with a different interface
class Adaptee {
    public void specificRequest() {
        System.out.println("Specific request from Adaptee");
    }
}

// Adapter class that implements the Target interface
class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // Translate the request to the adaptee's specificRequest
        adaptee.specificRequest();
    }
}

// Main class to demonstrate the Adapter Pattern
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request(); // This will call specificRequest() through the adapter
    }
}
