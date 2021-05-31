package pl.camp.it;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String a = "mateusz";

        Pattern compiledPattern = Pattern.compile("[A-Z]{1}[\\@\\!ńżćś]{2}[a-z]*");
        Matcher matcher = compiledPattern.matcher("M@ćarcin");

        Double d= 56.07;

        String D = d.toString();

        System.out.println(matcher.matches());


    }
}
