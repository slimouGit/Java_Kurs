package Mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArticleMapper {

    public static void main(String[] args) {
        List<Article> articles = Arrays.asList(
                new Article(
                        1,
                        "For Loop Java Tutorial",
                        "Dimitris Tasios"),
                new Article(
                        1,
                        "For Loop Java Tutorial",
                        "Dimitris Tasios"),
                new Article(
                        2,
                        "Java Interface Tutorial",
                        "Georgios - Nikolaos Palaiologopoulos"),
                new Article(
                        3,
                        "Java Generics Tutorial",
                        "Ignis Dei")
        );

        printMapedTitle(mapToTitle(articles));
    }

    private static List<String> mapToTitle(List<Article> articles) {
        return articles.stream()
                .map(Article::getTitle)
                .collect(Collectors.toList());
    }
    private static void printMapedTitle(List<String> mapedToTitleList) {
        mapedToTitleList.forEach(title -> System.out.println(title));
    }

}

