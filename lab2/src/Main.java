import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Analiza Peselu");
        System.out.println("Podaj 11 cyfr swojego peselu");

        Scanner scanner = new Scanner(System.in);

        String pesel2 = scanner.nextLine();
        Pesel pesel = new Pesel(pesel2);

        if (pesel.getPesel().length()==11) {
            String rok=pesel.getPesel().substring(0,4);
            String mies=pesel.getPesel().substring(5,6);
            String dzien=pesel.getPesel().substring(7,8);
            int plec=Integer.parseInt(pesel.getPesel().substring(11));
            String kontrol=pesel.getPesel().substring(11);
            if(plec%2) {
                String plec_wynik ="kobieta";
            }else {
                String plec_wynik ="mezczyzna";
            }
            System.out.println("Dzien: "+dzien+"\nMiesiac: "+mies+"\nRok: "+rok+"\nPlec: "+plec);

        } else {
            System.out.println("Podano " + pesel.getPesel().length() + ((pesel.getPesel().length() > 11) ? " za duzo" : " za malo") + " znakow!");
        }
    }
}
