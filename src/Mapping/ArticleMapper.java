package Mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArticleMapper {


    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();
        Article forLoop = new Article(
                1,
                "For Loop Java Tutorial",
                "Dimitris Tasios"
        );
        Article interfaceTutorial = new Article(
                2,
                "Java Interface Tutorial",
                "Georgios - Nikolaos Palaiologopoulos"
        );
        Article generics = new Article(
                3,
                "Java Generics Tutorial",
                "Ignis Dei"
        );
        Article mathRandom = new Article(
                4,
                "Math.random Java Tutorial",
                "Georgios - Nikolaos Palaiologopoulos"
        );
        articles.add(forLoop);
        articles.add(interfaceTutorial);
        articles.add(generics);
        articles.add(mathRandom);
        List<String> mapedToTitleList = mapToTitle(articles);

        printMapedTitle(mapedToTitleList);
    }
    private static List<String> mapToTitle(List<Article> articles) {
        return articles.stream()
                .map(Article::getTitle)
                .collect(Collectors.toList());
//        return articles.stream()
//                .map(article -> article.getTitle())
//                .collect(Collectors.toList());
    }
    private static void printMapedTitle(List<String> mapedToTitleList) {
        mapedToTitleList.forEach(title->System.out.println(title));
    }

}

