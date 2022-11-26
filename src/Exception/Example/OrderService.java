package Exception.Example;

public class OrderService {
    public String loadOrder(String i) {
        Order order = new Order();
        String requestedArticle = "";
        try{
            requestedArticle = order.loadOrder(i);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return requestedArticle;
    }
}
