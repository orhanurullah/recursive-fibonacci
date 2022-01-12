import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Recursive Metod ile Fibonacci Hesaplama Programı");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci Sınırını Girin : ");
        int num = scanner.nextInt();
        System.out.println(fibonacci(num));

    }
    static int fibonacci(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacci(num -1) + fibonacci(num - 2);
    }
}
