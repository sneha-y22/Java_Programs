public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

//output
*
* *
* * *
* * * *
* * * * *


public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}

//output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

  
public class Main {

  public static void main(String[] args) {
    char last = 'E', alphabet = 'A';

    for (int i = 1; i <= (last - 'A' + 1); ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(alphabet + " ");
      }
      ++alphabet;

      System.out.println();
    }
  }
}

//output
A
B B
C C C
D D D D
E E E E E


public class Main {

  public static void main(String[] args) {
    int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}

//output

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
