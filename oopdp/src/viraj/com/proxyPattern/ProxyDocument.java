package viraj.com.proxyPattern;

public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String fileName;

    public ProxyDocument(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (getUserRole().equals("Admin")) {
            if (realDocument == null) {
                realDocument = new RealDocument(fileName);
            }
            realDocument.display();
        } else {
            System.out.println("Access Denied. Admin role is required to display the document.");
        }
    }

    private String getUserRole() {
        // This method would normally check user credentials against a security system
        // For demo, assume user role is fetched from environment or configuration
        return "Admin";
    }
}
