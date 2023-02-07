package design_patterns;

import design_patterns.structural_patterns.facade.Message;
import design_patterns.structural_patterns.facade.NotificationServer;
import design_patterns.structural_patterns.facade.NotificationService;

public class Main {
    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello World", "target");
    }
}