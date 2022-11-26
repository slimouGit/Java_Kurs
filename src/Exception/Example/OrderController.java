package Exception.Example;

public class OrderController {
    public static void main(String[] args){
        OrderService orderService = new OrderService();
        String requestedArticle = orderService.loadOrder("milke");
        System.out.println(requestedArticle);
    }
}
