package practical1;

import java.util.*;

public class Practical1c {

public static void main(String[] args) {

int a , b , c , d;

Scanner sc = new Scanner(System.in);

System.out.println("Enter three Integers : ");

a = sc.nextInt();

b = sc.nextInt();

c = sc.nextInt();

d = sc.nextInt();

int result = a + b * c % d ;

System.out.println("Result : " +result);

}

}
