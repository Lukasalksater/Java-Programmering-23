import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int num = scanner.nextInt();
int num2 = scanner.nextInt();
int num3 = scanner.nextInt();
scanner.close();

if(num >= num2 && num >= num3){
System.out.println(num);
}

else if (num2 >= num && num2 >= num3){
System.out.println(num2);
}

else {
  System.out.println(num3);
}
        
    }
}
