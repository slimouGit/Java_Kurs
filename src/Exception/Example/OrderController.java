package Exception.Example;

public class OrderController {
    public static void main(String[] args){
        OrderService orderService = new OrderService();
        String requestedArticle = orderService.loadOrder1("milke");
        System.out.println(requestedArticle);

        //Funktioniert unschoen
        String articleName = orderService.loadArticleName3("milk");
        System.out.println(articleName);
    }
}
