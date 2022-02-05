package basicprogramming;
import java.util.Scanner;
public class Program26 {
//    km to Miles, centigrade to fahrenheit, sqft to acre
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter km: ");
        int km = input.nextInt();
        System.out.println("Enter centigrade: ");
        int centigrade = input.nextInt();
        System.out.println("Enter sqft: ");
        int sqft = input.nextInt();
        System.out.println("Converting to miles from kilometers: " + (km*0.62171f));
        System.out.println("Converting to fahrenheit from centigrade: " + (float)(((float)centigrade * (float)(9/5))+ (float)32));
        System.out.printf("Converting to acre from sqft: %.10f" , ((float)sqft/(float)43560));
    }
}
