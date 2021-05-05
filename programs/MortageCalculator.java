import java.util.Scanner;

public class MortageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the details below.");
        System.out.print("Principal : Rs.");
        int principal = sc.nextInt();
        System.out.print("Annual Interest Rate : ");
        double rate = sc.nextDouble();
        System.out.print("Period (Years) : ");
        int period = sc.nextInt();
        int tn=period*12; //total number of months
        double nr = rate/1200; //monthly rate
        double mortage = (double)(principal * (nr*(Math.pow(1+nr,tn)))/((Math.pow(1+nr,tn))-1));
        System.out.println("Mortage Value : Rs." + mortage);

    }
}
