public class Pesel {
    String pesel;

    Pesel(String pesel){
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }
    public int getRok(){
        int rok=Integer.parseInt(getPesel().substring(0,2));
        int miesiac=Integer.parseInt((getPesel().substring(2,4)));
        if(miesiac>80){
            return 1800+rok;
        }else if(miesiac>60){
            return 2200+rok;
        }else if(miesiac>40){
            return 2100+rok;
        }else if(miesiac>20){
            return 2000+rok;
        }else
            return 1900+rok;
    }
    public int getMiesiac(){
        int miesiac=Integer.parseInt(getPesel().substring(2,4));
        if(miesiac>80){
            return miesiac-80;
        }else if(miesiac>60){
            return miesiac-60;
        }else if(miesiac>40){
            return miesiac-40;
        }else if(miesiac>20){
            return miesiac-20;
        }else
            return miesiac;
    }
    public int getDzien(){
        int dzien=Integer.parseInt(getPesel().substring(4,6));
        return dzien;
    }
    public String getPlec(){
        int plec=Integer.parseInt(getPesel().substring(9,10));
        if(plec%2==0) {
            return "kobieta";
        }else
            return "mezczyzna";
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

}
