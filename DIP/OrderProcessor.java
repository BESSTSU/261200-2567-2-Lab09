package DIP;

public class OrderProcessor
{

  private final NotificationService Service;
  
  public OrderProcessor(NotificationService Service)
  {

    this.Service = Service;

  }
    
  public void processOrder(Order order)
  {
    // Process order
    Service.notify("Order processed!!!!!");

  }

}
