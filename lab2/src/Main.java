import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Analiza Peselu");
        System.out.println("Podaj 11 cyfr swojego peselu");

        Scanner scanner = new Scanner(System.in);
        String pesel=scanner.nextLine();
        try {
            long temp = Long.parseLong(pesel);

        }catch (Exception e){
            System.err.println("Nie podales cyfry!");
            System.err.println(e.getMessage());
            System.err.println(e);
        }
        check(pesel);
    }

    private static void check(String pesel){
        if (pesel.length() == 11) {
            if(control(pesel)==1){
                Pesel pesel_1 = new Pesel(pesel);
                System.out.println("Dzien: " + pesel_1.getDzien() + "\nMiesiac: " + pesel_1.getMiesiac() + "\nRok: " + pesel_1.getRok() + "\nPlec: " + pesel_1.getPlec());
            }else
                System.err.println("Nie poprawny pesel");

        } else
            System.err.println("Podano " + pesel.length() + ((pesel.length() > 11) ? " znaki/n za duzo" : " znaki\n za malo") + " znakow");
    }
    private static int control(String pesel ) {
        int wynik=Integer.parseInt(pesel.substring(0,1))*9+Integer.parseInt(pesel.substring(1,2))*7+Integer.parseInt(pesel.substring(2,3))*3+Integer.parseInt(pesel.substring(3,4))*1+Integer.parseInt(pesel.substring(4,5))*9+Integer.parseInt(pesel.substring(5,6))*7+Integer.parseInt(pesel.substring(6,7))*3+Integer.parseInt(pesel.substring(7,8))*1+Integer.parseInt(pesel.substring(8,9))*9+Integer.parseInt(pesel.substring(9,10))*7;
        if(wynik%10==Integer.parseInt(pesel.substring(10,11))) {
            return 1;
        }else
            return 0;
    }
}




