package sheet;

import java.util.Scanner;

public class problem12 {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter Three Numbers");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    if (num1 <= num2 && num1 <= num3) {
      if (num2 <= num3)
        System.out.printf("The Order Is: %d  %d  %d", num1, num2, num3);
      else
        System.out.printf("The Order Is: %d  %d  %d", num1, num3, num2);
    } else if (num2 <= num1 && num2 <= num3) {
      if (num1 <= num3)
        System.out.printf("The Order Is: %d  %d  %d", num2, num1, num3);
      else
        System.out.printf("The Order Is: %d  %d  %d", num2, num3, num1);
    } else {
      if (num1 <= num2)
        System.out.printf("The Order Is: %d  %d  %d", num3, num1, num2);
      else
        System.out.printf("The Order Is: %d  %d  %d", num3, num2, num1);
    }

  }
}