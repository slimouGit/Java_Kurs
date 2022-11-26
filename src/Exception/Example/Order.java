package Exception.Example;

import java.util.ArrayList;

public class Order {

    ArrayList<String> articles = new ArrayList<String>() {
        {
            add("milk");
            add("banana");
            add("water");
        }
    };
    public String loadOrder(String i) {
        String requestedArticle = "";
        if(this.articles.contains(i)){
            requestedArticle = i;
        }else {
            throw new RuntimeException("Article not available");
        }
        return requestedArticle;
    }

    public String loadArticleName1(String i) {
        return null;
    }

    public void loadArticleName2(String i) {
        throw new RuntimeException();
    }
}
