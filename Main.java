import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        num= scanner.nextInt();
        arttırma(azaltma(num),num);
    }

    private static int azaltma(int num) {
        System.out.println(num+" ");
        if(num<=0)
        {
            return num;
        }
        return azaltma(num-5);
    }
    private static int arttırma(int num ,int a) {
        System.out.println(num+" ");
        if(num==a)
        {
            return 1;
        }
        return arttırma(num+5,a);
    }
}