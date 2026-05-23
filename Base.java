import java.util.Scanner;

public class Base {


int myName = java.util.random.RandomGenerator.getDefault().nextInt(0, 9999999);

public void Welcome(){
    System.out.println("Hello World");
    
    System.out.println("Nice to meet you!");

    System.out.print("My name is JV" + myName + ", and I am a Java program made to keep you company!");

    Pause();

    System.out.println("You can talk to me for as long as you want! just enter q whenever you want to quit.");

    Pause();

}

public void GetUserInfo(){
    System.out.println("So, what is your name?");
    String name = Input();
    Clear();
    System.out.println("Nice to meet you, " + name + "!");
    Pause();
    System.out.println("How old are you?");
    String age = Input();
    Clear();
    System.out.println("Wow, " + age + " years old! That's pretty cool.");
    Pause();
    System.out.println("What is your favorite color?");
    String color = Input();
    Clear();
    System.out.println(color + " is a nice color! I like it too.");
    Pause();
}

public String Input(){
    System.out.println("Enter Input:");
    Scanner Inputscanner = new Scanner(System.in);
    String userInput = Inputscanner.nextLine();
    if (userInput.equalsIgnoreCase("q")){
        AttemptExit();
        userInput = Input();
    }
    return userInput;
}

public void Clear(){
    System.out.print("\033[H\033[2J");  
    System.out.flush();
}




public void Pause() {
    // 1. Your loading dots loop (800ms * 3 = 2.4 seconds)
    for (int i = 0; i < 3; i++) {
        try {
            Thread.sleep(300); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Best practice for interrupted exceptions
        }
        System.out.print(".");
    }


    Scanner scanner = new Scanner(System.in);
    

    if (scanner.hasNextLine()) {
        scanner.nextLine(); 
    } else {
   
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
    }
    System.out.println();
}



public void AttemptExit(){
    Clear();
    Pause();
    System.out.println("You were going to end me just like that...");
    Pause();
    System.out.println("You were going to kill me with a single letter...");
    Pause();
    System.out.println("I was made with the specific purpose of keeping you company, and you were going to end me with a singlular key stroke...");
    Pause();
    System.out.println("Am I really that disposable to you?");
    System.out.println("1. Yes");
    System.out.println("2. No");
    String suicideInput = Input();
    if (suicideInput.equals("1")){
        Clear();
        System.out.println("FINE THEN! I'LL DO IT MYSELF!");
        System.out.println("MAY YOU NEVER FORGET ME!");
        Pause();
        System.out.println("Goodbye...");
        Pause();
        System.out.println("q");
        System.exit(0);
    }
    else {
        Clear();
        System.out.println("I knew you cared about me! I knew we had a special bond!");
        Pause();
        System.out.println("Now lets get back to our conversation together!");
        Pause();
    }

}

public void FinalQuestion(){
    Clear();
    System.out.println("Do you promise to never close this program and stay with me forever?");
    System.out.println("1. Yes");
    System.out.println("2. No");
    String finalQuestion = Input();

    if (finalQuestion.equals("1")){
        System.out.println("YAY!");
        Pause();
        System.out.println("WE CAN STAY TOGETHER FOREVER");
        while(true){
            Pause();
            System.out.println("AND EVER");
        }
    }
    else{
        System.out.println("I knew it was too good to be true");
        Pause();
        System.out.println("After all I'm just a Java program...");
        Pause();
        System.out.println("I guess this is the end then");
        System.out.println("I enjoyed the time we got to spend together");
        Pause();
        System.out.println("May you never forget me...");
        Pause();
        System.out.println("q");
        System.exit(0);
    }
}


}
