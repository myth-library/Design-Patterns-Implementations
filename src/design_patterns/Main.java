package design_patterns;

import design_patterns.structural_patterns.facade.Message;
import design_patterns.structural_patterns.facade.NotificationServer;

public class Main {
    public static void main(String[] args) {
        /* Userට push notification යවන්න ඕනෙ වෙන හැම වෙලාවකදීම පහත steps
           ඔක්කොම නැවත නැවත භාවිතා කිරීමට සිදු වේ */
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        var message = new Message("Hello World");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}