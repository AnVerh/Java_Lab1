import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int C = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a");
        while(!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("a must be a double!");
        }
        double a = scanner.nextDouble();

        System.out.println("Enter number b");
        while(!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("b must be an double!");
        }
        double b = scanner.nextDouble();
        double n;
        System.out.println("Enter number n");
        while(true){
            if(!scanner.hasNextDouble()){
            scanner.next();
            System.out.println("n must be a double!");
            continue;
            }
            n = scanner.nextDouble();
            if(n<a){
                System.out.println("n must be bigger than a!");
                continue;
            }
            break;
        }

        System.out.println("Enter number m");
        double m;
        while(true){
            if(!scanner.hasNextDouble()){
                scanner.next();
                System.out.println("m must be a double!");
                continue;
            }
            m = scanner.nextDouble();
            if(m<b){
                System.out.println("m must be bigger than b!");
                continue;
            }
            break;
        }

        double summary = 0;
        for(double i=a; i<n; i++){
            for(double j =b; j<m; j++){
                if(i != 0){
                summary += (i + j) / (i + C);
                }
            }
        }
        System.out.println("The result is: " + summary);
        scanner.close();
    }
}