package janani;
import java.util.Scanner;
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1,str2;
int a,b;
Scanner ja=new Scanner(System.in);
System.out.println("enter the string");
str1=ja.next();
//System.out.println("enter the str2");
str2=ja.next();
a=str1.length();
b=str2.length();
if(a>b){
System.out.println(str1);

	}
else{
	System.out.println(str2);
}

}
}
