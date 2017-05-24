import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	
	
	public static long fib(int n) {
        if (n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
			System.out.print(i+" ");
		System.out.println();
		for(int i = 1; i <= n; i++)
			System.out.print(fib(i)+" ");

		
	}

}

	