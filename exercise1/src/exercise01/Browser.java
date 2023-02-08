package exercise01;

public class Browser {
	public int n;
private static String[] url;
Browser(){}
Browser(int num, String[] urlinit){
	n=num;
	url=urlinit;
	}
public void set(int num, String[] s) {
	n=num;
      url=s;
}
public void print() {
	System.out.println("the urls are ");
	for(int i=1;i<=n;i++)
	{
		System.out.println(url[i]);
	}
}
}
