package practical1;

import java.util.*;

public class Practical1 {


public static void main(String[] args) {

boolean assignmentSubmitted;

Scanner t = new Scanner(System.in);

System.out.println("Enter whether assignment is completed or not : ");

assignmentSubmitted = t.nextBoolean();

if(assignmentSubmitted)

System.out.println("Assignment Completed");

else

System.out.println("Assignment not Completed");

}


}
