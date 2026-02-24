package practical2; import java.util.*; 
public class q3 { 
  public static void main(String[] args) { 
    Scanner t = new Scanner(System.in); 
    String name; int m1,m2,m3; 
    System.out.println("Enter your Name : "); 
    name = t.nextLine(); 
    System.out.println("Enter marks for SM , EMSD, and IPR : "); 
    m1 = t.nextInt(); m2 = t.nextInt(); m3 = t.nextInt(); 
    System.out.println("Student Name : " +name); 
    int average = (m1+m2+m3)/3; 
    int grade = average/10; 
    switch(grade) { 
      case 10 : 
      case 9 : 
        System.out.println("Grade O"); 
        break; 
      case 8 : 
        System.out.println("Grade A"); 
        break; 
      case 7 : 
        System.out.println("Grade B"); 
        break; 
      case 6 : 
        System.out.println("Grade C");
        break; 
      case 5 : 
      case 4 : 
        System.out.println("Grade D"); 
        break; 
      default : 
        System.out.println("Grade F"); 
    } 
  } 
}
