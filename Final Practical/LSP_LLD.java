interface SocialMediaPlatform {
    void sendMessage(String message);
    void postContent(String content);
}

class Facebook implements SocialMediaPlatform {
    public void sendMessage(String message) {
        System.out.println("[Facebook] Message sent: " + message);
    }
    public void postContent(String content) {
        System.out.println("[Facebook] Post published: " + content);
    }
}

class Instagram implements SocialMediaPlatform {
    public void sendMessage(String message) {
        System.out.println("[Instagram] DM sent: " + message);
    }
    public void postContent(String content) {
        System.out.println("[Instagram] Photo/reel posted: " + content);
    }
}

class WhatsApp implements SocialMediaPlatform {
    public void sendMessage(String message) {
        System.out.println("[WhatsApp] Message sent: " + message);
    }
    public void postContent(String content) {
        throw new UnsupportedOperationException("WhatsApp does not support public posts!");
    }
}

public class LSP_Wrong {
    static void publishUpdate(SocialMediaPlatform platform, String content) {
        platform.postContent(content);
    }

    public static void main(String[] args) {
        SocialMediaPlatform fb    = new Facebook();
        SocialMediaPlatform insta = new Instagram();
        SocialMediaPlatform wa    = new WhatsApp();

        publishUpdate(fb,    "Summer sale — 20% off!");
        publishUpdate(insta, "New collection drop!");
        publishUpdate(wa,    "Check out our new offer");
    }
}