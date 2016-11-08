package main;

import java.util.Scanner;

/**
 * Created by kyon on 24.10.16.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu(scanner);
        scanner.close();
    }

    public static void MainMenu(Scanner scanner){
        do {
            System.out.println();
            System.out.println("Please choose one of the following algorithms.");
            System.out.println("1 -> euclid");
            System.out.println("2 -> euclid recursive");
            System.out.println("3 -> euclid Mod iterative");
            System.out.println("4 -> euclid Mod recursive");
            System.out.println("5 -> exit ...");
            System.out.println();
            System.out.println("Put in your choice:");

            long a;
            long b;
            int choice = 0;

            try {
                if (scanner.hasNext()) {
                    choice = scanner.nextInt();
                }
                switch (choice) {
                    case 1:
                        System.out.println("Type in your first number: ");
                        a = getNumber(scanner);
                        System.out.println("Type in your second number: ");
                        b = getNumber(scanner);
                        System.out.println("Result: " + EuclidIt(a, b));
                        break;
                    case 2:
                        System.out.println("Type in your first number: ");
                        a = getNumber(scanner);
                        System.out.println("Type in your second number: ");
                        b = getNumber(scanner);
                        System.out.println("Result: " + EuclidRec(a, b));
                        break;
                    case 3:
                        System.out.println("Type in your first number: ");
                        a = getNumber(scanner);
                        System.out.println("Type in your second number: ");
                        b = getNumber(scanner);
                        System.out.println("Result: " + EuclidRestIt(a, b));
                        break;
                    case 4:
                        System.out.println("Type in your first number: ");
                        a = getNumber(scanner);
                        System.out.println("Type in your second number: ");
                        b = getNumber(scanner);
                        System.out.println("Result: " + EuclidRestRec(a, b));
                        break;
                    case 5:
                        System.out.println("Exit Successful");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("This isn't a valid choice. Try again!");
                        System.out.println();
                        break;
                }

            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Oh ... there were some weird input. Restarting!");
                System.out.println();
            }

        }while(true);
    }

    public static long getNumber(Scanner scanner) throws Exception{

        try{
            return scanner.nextLong();
        }catch(Exception e){
            throw new Exception();
        }
    }

    public static long EuclidRec(long a, long b) {
        if(a == 0){
            return b;
        }else if(b == 0){
            return a;
        }else if ( a > b){
            return EuclidRec(a - b, b);
        }else{
            return EuclidRec(a, b - a);
        }
    }

    public static long EuclidIt(long a, long b){
        if(a == 0){
            return b;
        }

        while(b != 0){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }

    public static long EuclidRestRec(long a, long b){
        if(b == 0){
            return a;
        }else{
            return EuclidRestRec(b, a % b);
        }
    }

    public static long EuclidRestIt(long a, long b){
        long h;
        while(b != 0){
            h = a % b;
            a = b;
            b = h;
        }
        return a;
    }

}
