package DIP;

public class EmailNotic implements NotificationService
{
    @Override
    public void notify(String message)
    {

      System.out.println("Sended Email Notification!!!!: " + message);

    }

}
  