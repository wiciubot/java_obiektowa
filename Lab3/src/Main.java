import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("program wczytujący z wiersza poleceń liczbę całkowitą 3-cyfrową");
        hashMap.put("1","jeden");
        hashMap.put("2","dwa");
        hashMap.put("3","trzy");
        hashMap.put("4","cztery");
        hashMap.put("5","piec");
        hashMap.put("6","szesc");
        hashMap.put("7","siedem");
        hashMap.put("8","osiem");
        hashMap.put("9","dziewiec");
        hashMap.put("0","zero");
        hashMap.put("-","minus");
        Scanner scanner=new Scanner(System.in);
        String liczba= scanner.nextLine();

        try{
            check(liczba);
        }catch(Exception e){
            System.err.println("Blad!");
            System.err.println(e.getMessage());
            System.err.println(e);
        }
        scanner.close();
    }

    static private void check(String liczzba1){
        int liczba=Integer.parseInt(liczzba1);
        if((liczba>-1000&&liczba<-99) ||(liczba<1000&&liczba>99)){
            System.out.println("Twoja liczba to: ");
            if(liczba<0) {
                System.out.print(hashMap.get(liczzba1.substring(0, 1)) + " ");
                System.out.println(hashMap.get(liczzba1.substring(1, 2)) + " " + hashMap.get(liczzba1.substring(2, 3)) + " " + hashMap.get(
                        liczzba1.substring(3, 4)));
            }else
            {
                System.out.println(hashMap.get(liczzba1.substring(0, 1) )+ " "+hashMap.get(liczzba1.substring(1, 2)) + " " + hashMap.get(liczzba1.substring(2, 3)) + " " );

            }

        }else if(liczba>999&&liczba<-999) {
            throw new IllegalArgumentException("Liczba przekracza zakres: -1000<liczba<-99&&99<liczba<1000 ");
        }else
            throw new IllegalArgumentException("liczba nie jest 3 cyfrowa !");
    }
    static HashMap<String, String > hashMap= new HashMap<>();
}
