import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int liczba = 11011000;
        int wynik=0,n=0;
        String syst=new String();

        System.out.println("Program do konwertowania liczby binarnej na liczbe w systemie 10-tnym, 3-kowym lub 16-kowym ");
        System.out.println(liczba);
        System.out.println("Podaj slownie na jaki system chcesz przekomwertowac:");
        System.out.println("(dziesietny, trojkowy, szesnastkowy)");
        Scanner scan =new Scanner(System.in);
        syst = scan.nextLine();

        switch (syst){

            case "dziesietny":

                System.out.println("Twoja liczba to " + decimal(liczba));
                break;

            case "trojkowy":

                System.out.println("Twoja liczba to "+octa(liczba));
                break;

            case "szesnastkowy":
                System.out.println("Twoja liczba to "+hexa(liczba));
                break;

            default:
                System.out.println("Blednie wpisana nazwa !");
        }
    }

    public static int decimal(int bin)
    {
        int decimal_numb = 0, i = 0;

        while(bin != 0)
        {
            decimal_numb += (bin % 10) * Math.pow(2, i);
            ++i;
            bin /= 10;
        }
        return decimal_numb;
    }

    public static int octa(int bin)
    {
        int octal_numb = 0, i = 1;
        int decimal_numb=decimal(bin);
        while (decimal_numb != 0)
        {
            octal_numb += (decimal_numb % 8) * i;
            decimal_numb /= 8;
            i *= 10;
        }
        return octal_numb;
    }

    public static String hexa(int bin)
    {
        int rem;
        int deci=decimal(bin);
        String hexa_numb="";
        System.out.println("aa "+hexa_numb);

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(deci>0)
        {
            rem = deci%16;
            hexa_numb = hex[rem] + hexa_numb;
            deci = deci/16;
        }

        return hexa_numb;
    }
}

