import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double pole=0;
    System.out.println("1.Pole prostokąta\n 2.Pole trójkąta prostokątnego");
    Scanner scan = new Scanner(System.in);
    int wybor=scan.nextInt();
     System.out.println("Podaj a");
    double a =scan.nextDouble();
     System.out.println("Podaj b");
    int b =scan.nextInt();
     System.out.println("Podaj h");
    double h =scan.nextDouble();
    switch(wybor){
      case 1:
        pole= a*b;
        System.out.println("Pole prostokąta\n" + pole);
      case 2:
        pole =(a*h)/2;
         System.out.println("Pole trojkata prostokatnego\n" + pole);
    }
    
  }
}