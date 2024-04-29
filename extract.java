import java.io.DataInputStream;
import java.io.IOException;

public class extract {

    public static void main(String args[])throws IOException
{
DataInputStream dis=new DataInputStream(System.in); 
System.out.println("Enter the string");
String s=dis.readLine();
System.out.println("Enter the starting portion for the extracted string"); 
int n=Integer.parseInt(dis.readLine());
System.out.println("Enter the ending portion for the extracted string"); 
int m=Integer.parseInt(dis.readLine());
String s1;
StringBuffer sb=new StringBuffer(s); 
s1=sb.substring(n,m);
System.out.println("The extracted portion is:"+s1); 
sb.delete(n,m);
System.out.println("The remaining portion is:"+sb);
}

}