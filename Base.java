import java.util.Scanner;

public class Base {


int myName = java.util.random.RandomGenerator.getDefault().nextInt(0, 9999999);

public void Welcome(){
    System.out.println("Hello World");
    
    System.out.println("Nice to meet you!");

    System.out.print("My name is " + myName + ", and I am a Java program made to keep you company!");



}

public String Input(){
    System.out.println("Enter Input:");
    try (Scanner scanner = new Scanner(System.in)) {
    String userInput = scanner.nextLine();
    return userInput;
}}



public void Pause(){
    System.out.println("");
    for (int i = 0; i < 3; i++) {
        
        System.out.print(".");
        try {
            Thread.sleep(800); // Sleep for 500 milliseconds (0.5 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    System.out.println("");
}













}
