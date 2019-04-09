public class Publikacja {
    String autor;
    String tytul;
    int strony;
    Publikacja(){};
    Publikacja(String autor,String tytul,int strony){
        this.autor=autor;
        this.tytul=tytul;
        this.strony=strony;
        toString();
    };

    public int getStrony() {
        return strony;
    }

    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setStrony(int strony) {
        this.strony = strony;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    public void toString(){
        System.out.println(autor+tytul+strony);

    }

}
