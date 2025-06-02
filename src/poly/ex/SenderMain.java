package poly.ex;

public class SenderMain {
    public static void main(String[] args) {
        Sender[] senderArr = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senderArr) {
            sender.sendMessage("환영합니다.!");
        }
    }
}
