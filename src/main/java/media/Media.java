package media;

import java.util.Arrays;
import java.util.Scanner;

public class Media {
  public static void main(String args[]) {

    int i = 0;
    int x = 1;
    float [] grades = new float[4];

    do {
      Scanner s = new Scanner(System.in);

      System.out.print("\033[38;2;255;255;255m\033[1mWrite the note: ");
      grades[i] = s.nextFloat();
      i++;

      if (grades[0] < 0 || grades[0] > 10) {
        System.out.println("\033[38;2;255;0;38m\033[1mInvalid note. Please, write a note of 0 to 10");
        System.out.print("\033[38;2;255;255;255m\033[1mWrite the note: ");
        grades[0] = s.nextFloat();
      }
      else if (grades[1] < 0 || grades[1] > 10){
        System.out.println("\033[38;2;255;0;38m\033[1mInvalid note. Please, write a note of 0 to 10");
        System.out.print("\033[38;2;255;255;255m\033[1mWrite the note: ");
        grades[1] = s.nextFloat();
      }
      else if (grades[2] < 0 || grades[2] > 10){
        System.out.println("\033[38;2;255;0;38m\033[1mInvalid note. Please, write a note of 0 to 10");
        System.out.print("\033[38;2;255;255;255m\033[1mWrite the note: ");
        grades[2] = s.nextFloat();
      }
      else if (grades[3] < 0 || grades[3] > 10){
        System.out.println("\033[38;2;255;0;38m\033[1mInvalid note. Please, write a note of 0 to 10");
        System.out.print("\033[38;2;255;255;255m\033[1mWrite the note: ");
        grades[3] = s.nextFloat();
      }
      x++;
    } while (x <= 4);

    Float totalValue = grades[0] + grades[1] + grades[2] + grades[3];
    Float gradeAverage = totalValue / 4;

    System.out.println("All grades: " + Arrays.toString(grades) + "\r\n");
    System.out.printf("Total sum of grades: " + String.format("%.2f", totalValue) + "\r\n");
    System.out.printf("|" + grades[0] + "|" + grades[1] + "|" + grades[2] + "|"+ grades[3] + "|"+ " ➞ " + String.format("%.2f", totalValue) + " ➞ " + String.format("%.2f", gradeAverage));

    if (gradeAverage <= 5.9 && gradeAverage > 4) {
      System.out.print(" \033[38;2;255;238;0m\033[1mIn recovery\033[38;2;130;130;130m\033[1m");
    }
    if (gradeAverage >= 6) {
      System.out.print(" \033[38;2;0;255;242m\033[1mApproved\033[38;2;130;130;130m\033[1m");
    }
    if (gradeAverage < 3.9) {
      System.out.print(" \033[38;2;255;0;0m\033[1mDisapproved\033[38;2;130;130;130m\033[1m");
    }
  }
}
