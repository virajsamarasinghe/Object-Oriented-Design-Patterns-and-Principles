package viraj.com.proxyPattern;

public class Main {
    public static void main(String[] args) {
        Document document = new ProxyDocument("testfile.pdf");
        document.display();  // Output will depend on the user role
    }
}
