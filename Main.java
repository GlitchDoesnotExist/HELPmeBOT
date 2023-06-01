import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello ([USER]!");

    Scanner name_in = new Scanner (System.in);
    System.out.println("Tell me, [USER], what is your name:");
      
    String name = name_in.nextLine();
    System.out.println("Hello, " + name + ", my name is [HELPBOT]");
  }
}