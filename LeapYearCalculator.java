import java.util.Scanner;


public class LeapYearCalculator {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int year;
        boolean leap;

        System.out.print("Enter a year: ");
        year = Integer.parseInt(sc.nextLine());


        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leap = true;
        } else {
            leap = false;
        }
        
        System.out.println(leap);

        sc.close();
    }     
}              