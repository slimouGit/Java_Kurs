package Exception.Example;

public class OrderService {
    public String loadOrder1(String i) {
        Order order = new Order();
        String requestedArticle = "";
        try{
            requestedArticle = order.loadOrder(i);
        } catch (RuntimeException e){
            //TODO: hier Error loggen
            System.out.println(e.getMessage());
        }
        return requestedArticle;
    }
    public String loadOrder2(String i) {
        Order order = new Order();
        String requestedArticle = "";
        try{
            requestedArticle = order.loadOrder(i);
        } catch (RuntimeException e){
            throw new RuntimeException("Article not available");
        }
        return requestedArticle;
    }
    public String loadArticleName1(String i){
        Order order = new Order();
        String articleName = order.loadArticleName1(i);
        if(null == articleName){
            throw new RuntimeException("No articlename found");
        }
        return articleName;
    }
    public void loadArticleName2(String i){
        Order order = new Order();
        try{
            order.loadArticleName2(i);
        }catch (RuntimeException e){
            throw new RuntimeException("No articlename found");
        }
    }
    public String loadArticleName3(String i){
        String articleName = null;
        if(null == articleName){
            throw new RuntimeException("No articlename found");
        }
        return articleName;
    }
}
