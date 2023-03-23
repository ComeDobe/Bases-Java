package Collections.GenericBox;

public class Main {
    public static void main(String[] args) {


//
//            GenericBox1 box = new GenericBox1("Contenu");
//            System.out.println("Contenu de l'attribut : " + box.getElement());
//            box.setElement("Nouveau contenu");
//            System.out.println("Nouveau contenu de l'attribut : " + box.getElement());
//
//            GenericBox2 box2 = new GenericBox2(10);
//            System.out.println("Contenu de l'attribut : " + box2.getElement());
//            box2.setElement(25);
//            System.out.println("Nouveau contenu de l'attribut : " + box2.getElement());

        GenericBox1 < String> box1 = new GenericBox1<String>();
        box1.setElement("Contenu");
        System.out.println("Contenu de l'attribut : " + box1.getElement());
        box1.setElement("Nouveau contenu");

        GenericBox2<Integer> box2 = new GenericBox2<Integer>();
        box2.setElement(10);
        System.out.println("Contenu de l'attribut : " + box2.getElement());
        box2.setElement(25);
        System.out.println("Nouveau contenu de l'attribut : " + box2.getElement());




        }
    }

