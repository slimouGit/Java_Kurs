package Collections.HashMap_MultiLanguage;

import java.util.HashMap;

/**
 * Created by salim on 30.03.2019.
 */
public class Main {

    static HashMap<String,String> languageMap;

    public static void main(String[] args) {

        HashMap<String, String> german = new HashMap<>();
        german.put("mstart", "Starten");
        german.put("mlanguage", "Sprache wählen");
        german.put("mexit", "Beenden");

        HashMap<String, String> english = new HashMap<>();
        english.put("mstart", "start");
        english.put("mlanguage", "choose language");
        english.put("mexit", "exit");

        languageMap = english;

        System.out.println(languageMap.get("mstart"));
        System.out.println(languageMap.get("mlanguage"));
        System.out.println(languageMap.get("mexit"));


    }
}
