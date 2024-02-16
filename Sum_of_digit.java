// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main{
    public static int splitAdd(long n)
    {
        int a = 0;
        while (n > 0) {
        a += n % 10;
        n /= 10;
		}
		return a;
    }
    public static int splitMul(long n)
    {
        int a = 1;
        while (n > 0) {
        a *= n % 10;
        n /= 10;
		}
		return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
		long num = sc.nextLong();
		int a = splitAdd(num);
		if(a < 10)
		{
		    a = a;
		}
		else if(a < 100)
		{
		    a = splitMul(a);
		}
		else if(a > 99 && a <= 999)
		{
		    a = splitAdd(a);
		}
		System.out.println(a);
    }
}
