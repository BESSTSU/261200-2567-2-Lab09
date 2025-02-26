package DIP;

public class SMSNotic implements NotificationService
{
    @Override
    public void notify(String message)
    {
      System.out.println("Sended SMS Notification: " + message);
    }

}
  