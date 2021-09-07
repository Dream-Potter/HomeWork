import java.util.Scanner;
public class Age{
    public static void main(String[] args){
        System.out.println("input your year of birth:");
        Scanner scanner = new Scanner(System.in);
        int birthYear = scanner.nextInt();
        int i = 1;
        int count = 0;
        System.out.println("leap year of a lifetime:");
        while(i <= 100){
            if((birthYear + i) % 100 == 0){
                if((birthYear + i) % 400 == 0){
                    System.out.println(birthYear+i);
                    count++;
                }
            }else if((birthYear + i) % 4 == 0){
                System.out.println(birthYear+i);
                count++;
            }
            i++;
        }
        System.out.println("There are "+count+" leap years/year.");
    }
}