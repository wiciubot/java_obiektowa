public class Ksiazka extends Publikacja {
    int strony;
    String autor;
    String tytul;
    //Publikacja
    public void toString(String autor, String tytul, int strony){
        System.out.println("| "+autor+" | "+tytul+" | "+strony+" |");
    }
}
