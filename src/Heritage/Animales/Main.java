package Heritage.Animales;

public class Main {
    public static void main(String[] args) {

//        Chien chien = new Chien( "Chien", 10, " aboye", 10);
//        Chat chat = new Chat( "Chat", 10, " aboye", "noir");

        Animal chien = new Chien( "Chien", 4, " aboye",10);
        Animal chat = new Chat( "Chat", 4, " miole", "noir");

        chien.afficherCaracteristique();
        chat.afficherCaracteristique();
    }
}