import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        int k,o=0,sayac=0;

        k=girdi.nextInt();

        for (int i = 1;i<=k;i++){
            if(i%3==0||i%4==0){
               o+=i;
               sayac++;
            }
        }
        System.out.println("Ortala :"+(o/sayac));
    }
}
