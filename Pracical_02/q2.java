package practical2; 
import java.util.*; 
public class q2 { 
  public static void main(String[] args) { 
    Scanner t = new Scanner(System.in); 
    String name; int m1,m2,m3; 
    System.out.println("Enter your Name : "); 
    name = t.nextLine(); 
    System.out.println("Enter marks for SM , EMSD, and IPR : "); 
    m1 = t.nextInt(); 
    m2 = t.nextInt(); 
    m3 = t.nextInt(); 
    System.out.println("Student Name : " +name); 
    int result = (m1>m2)?(m1>m3?m1:m3):(m2>m3?m2:m3); 
    System.out.println("Highest marks : " +result); 
  } 
}
