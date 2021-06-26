import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input=new Scanner(System.in);
        System.out.print("Basamak Sayisi: ");
        n=input.nextInt();

        for (int i=1; i<=n;i++){

          for(int k=1; k<=i; k++){
              System.out.print(" ");
          }
          for (int j=0; j<=2*(n-i);j++){
                System.out.print("*");
          }

            System.out.println(" ");

        }

    }
}
