package converter_matauang;
import java.util.Scanner;
import java.io.IOException;

public class Converter_MataUang {
    
    static boolean isRunning = true;
    
    static void showMenu() throws IOException{
        Yen y = new Yen();
        Won w = new Won();
        Usd u = new Usd();
        Poundsterling p = new Poundsterling();
        Ringgit r = new Ringgit();
        Scanner input = new Scanner(System.in);
        System.out.println("--------menu----------");
        System.out.println("1. Yen -> Rupiah");
        System.out.println("2. Won -> Rupiah");
        System.out.println("3. USD -> Rupiah");
        System.out.println("4. Poundsterling -> Rupiah");
        System.out.println("5. Ringgit -> Rupiah");
        System.out.println("Pilih Menu Di Atas :");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("Masukkan Jumlah Yen :");
                int inputy = input.nextInt();
                System.out.println("Jumlah Rupiah :"+y.setyen(inputy));
                break;
            case 2:
                System.out.println("Masukkan Jumlah Won :");
                int inputw = input.nextInt();
                System.out.println("Jumlah Rupiah :"+w.setwon(inputw));
                break;
            case 3:
                System.out.println("Masukkan Jumlah USD :");
                int inputu = input.nextInt();
                System.out.println("Jumlah Rupiah :"+u.setusd(inputu));
                break;
            case 4:
                System.out.println("Masukkan Jumlah Poundsterling :");
                int inputp = input.nextInt();
                System.out.println("Jumlah Rupiah :"+p.setpound(inputp));
                break;
            case 5:
                System.out.println("Masukkan Jumlah Ringgit :");
                int inputr = input.nextInt();
                System.out.println("Luasnya :"+r.setringgit(inputr));
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }

    public static void main(String[] args) throws IOException{
        do {
            showMenu();
        } while (isRunning);
    }
}
