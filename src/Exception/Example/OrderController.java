package Exception.Example;

public class OrderController {
    public static void main(String[] args){
        OrderService orderService = new OrderService();
        String requestedArticle1 = orderService.loadOrder1("milke");
        System.out.println(requestedArticle1);

        String requestedArticle2 = orderService.loadOrder2("milke");
        System.out.println(requestedArticle2);

        //Funktioniert unschoen
        String articleName = orderService.loadArticleName3("milk");
        System.out.println(articleName);
    }
}
