import java.util.Scanner;

public class Praktikum7 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
         System.out.println("Masuk Ke Sistem Parkir? y/n");
         char masuk = in.nextLine().charAt(0);

         if (masuk == 'y') {
             break;
         }
         if (masuk == 'n') {
            break;
         }
      }
   }
}