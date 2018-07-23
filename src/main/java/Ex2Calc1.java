import java.util.Scanner;

public class Ex2Calc1 {
    Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        double x1 = firstNum();
        double y1 = secondNum();
        char oper = operation();
        double z = calc(x1, y1, oper);
        System.out.print("Результат: ");
        System.out.printf("%6.4f", z);
    }

    public class firstNum () {
      double x = 0;
      System.out.println("Введите первое число");
      scanner x = scanner.nextDouble();


       }
       System.out.println("Please, enter second number");
       y = scanner.nextDouble();
       System.out.println("Выберете операцию: ");
       oper = scanner.next().charAt(0);

       public static
       switch (oper) {
           case '+':
               z = x + y;
               break;
           case '-':
               z = x - y;
               break;
           case '*':
               z = x * y;
               break;
           case '/':
               z = x / y;
               break;
       }
        return z;

       scanner.close();

           }
}