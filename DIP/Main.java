package DIP;

public class Main
{
    public static void main(String[] args)
    {
        OrderProcessor emailOrder = new OrderProcessor(new EmailNotic());
        emailOrder.processOrder(new Order());

        OrderProcessor smsOrder = new OrderProcessor(new SMSNotic());
        smsOrder.processOrder(new Order());
    }
}
