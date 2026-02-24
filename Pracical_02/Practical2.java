package practical2; 
import java.util.*;
public class Practical2 { 
public static void main(String[] args) { 
Scanner t = new Scanner(System.in); 
  int m1, m2, m3; String name; 
  System.out.println("Enter your Name : "); name = t.nextLine(); 
  System.out.println("Enter marks for SM , EMSD, IPR : "); 
  m1 = t.nextInt(); 
  m2 = t.nextInt(); 
  m3 = t.nextInt(); 
  System.out.println("Student Name : " +name); 
  if(m1>m2 && m1>m3) 
    System.out.println("Marks for SM are highest"); 
  else if(m2>m1 && m2>m3) 
    System.out.println("Marks for EMSD are highest"); 
  else System.out.println("Marks for IPR are highest"); 
 } 
}
