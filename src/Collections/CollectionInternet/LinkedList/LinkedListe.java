package Collections.CollectionInternet.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListe {
    public static void main(String[] args) {

        LinkedList<String> langages = new LinkedList<>();

        langages.add("Java");
        langages.add("Python");
        langages.add("PHP");
        langages.add("C");
        langages.add("C++");
        langages.add("JavaScript");
        langages.add("Ruby");
        langages.add("Go");
        langages.add("C#");

        System.out.println(" la liste des langages : ");
        for (String langage : langages) {
            System.out.println(" - " + langage);
        }
        // On utilise la methode contains pour vérifier si la langage existe dans la liste
        langages.contains("Java");
        System.out.println(" ce langage existe? " + langages.contains("Java"));

        // On cherche l'index du langage dans la liste
        langages.indexOf("Java");
        System.out.println(" le langage C# se trouve à l'index " +langages.indexOf("C#"));

        // On utilise l'iterator pour parcourir la liste
        Iterator<String> iterator = langages.iterator();
        while (iterator.hasNext()) {
            String langage = iterator.next();
            System.out.println(" - " + langage);
        }

        // On supprime avec la methode removeAll()
        langages.removeAll(langages);
        System.out.println(" la liste des langages : " + langages.removeAll(langages));
    // On ajoute avec la methode addAll()
        langages.addAll(0, langages);

        System.out.println(" la liste des langages : " + langages.addAll(0, langages));
    }
}
