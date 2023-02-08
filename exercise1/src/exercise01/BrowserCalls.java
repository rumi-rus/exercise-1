package exercise01;

import java.util.Scanner;

public class BrowserCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[5];
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number" );
		number = sc.nextInt();
		
        for(int i=1;i<=number;i++) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the url:");
        s[i] =scan.nextLine();
        }
        Browser b =new Browser();
        b.set(number,s);
b.print();
//System.out.println( s[1]);
	}

}
