import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

      // String[] langs = {"java","c#","python","php"};
       //for(String l: langs) {
         //  System.out.println("Я хочу выучить " + l);

           List<String> languages = new ArrayList<String>();
           languages.add("Java");
           languages.add("php");
           for(String k:languages) {
               System.out.println("тест " + k);
           }
       }
    }

