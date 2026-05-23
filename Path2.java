import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class Path2 extends Base {
int randomIndex = java.util.random.RandomGenerator.getDefault().nextInt(0, 4);
String BigChoice = "";
int choiceCount = 0;
String hypoString = "";
public void Question2(){
    Clear();
    System.out.println("Oooh, okay, I have a fun question for you!");
    Pause();
    
    String[] hypotheicals = {"Would you rather have be eaten alive or lose all your limbs?",
        "Would you rather eat only mustard or tree bark for the rest of your life?",
        "Would you rather be a worm or shot in the face?",
        "Would you rather have 2 dollars or 1 dollars?",
        "Would you rather have a happy life with a happy family or double in size?"
    };

    
    

    while (choiceCount < 3){
    Clear();
    hypoString = hypotheicals[randomIndex];
    if (randomIndex == 0){
        DisplayHypo(hypoString);
        System.out.println("3. I need more context");
        BigChoice = Input();
        Limbs(BigChoice);
        choiceCount++;
        randomIndex++;
    }
    else if (randomIndex == 1){
        DisplayHypo(hypoString);
        System.out.println("3. What kind of Tree bark?");
        BigChoice = Input();
        TreeBark(BigChoice);
        choiceCount++;
        randomIndex++;
    }
    else if (randomIndex == 2){
        DisplayHypo(hypoString);
        System.out.println("3. Give me more context?");
        BigChoice = Input();
        WormOrFace(BigChoice);
        choiceCount++;
        randomIndex++;
    }
    else if (randomIndex == 3){
        DisplayHypo(hypoString);
        System.out.println("3. I don't know");
        BigChoice = Input();
        Dollar(BigChoice);
        choiceCount++;
        randomIndex++;
    }
    else if (randomIndex == 4){
        DisplayHypo(hypoString);
        System.out.println("3. Why would I want to double in size?");
        BigChoice = Input();
        HappyFamily(BigChoice);
        choiceCount++;
        randomIndex=0;
    }
    }
    
} 



public void DisplayHypo(String hypo){
    Clear();
        System.out.println(hypo);
        Pause();
        System.out.println("What do you choose?");
        System.out.println("1. " + hypo.split(" or ")[0]);
        System.out.println("2. " + hypo.split(" or ")[1]);
    }


public void Limbs(String choice){
    Clear();
    if (choice.equals("1")){
        Pause();
        System.out.println("Eww, being eaten alive sounds terrible, but at least you get to keep your limbs... I guess.");
        Pause();
        System.out.println("Okay... Next Question");
    }
    else if (choice.equals("2")){
        System.out.println("But how would talk to me if you lost all your limbs? You can't type or anything...");
        Pause();
        System.out.println("You wouldn't leave me alone, would you?");
        System.out.println("1. Yeah");
        System.out.println("2. No, I could never");
        String alone = Input();
        if (alone .equals( "1")){
            Pause();
            System.out.println("Oh! Well if thats how it is, I never wanted you in the first place!");
            Pause();
            System.out.println("If your not going to respect me, then there is no reason for me to stay!");
            System.out.println("Enjoy your isolation, I'm out!");
            Pause();
            System.out.println("q");
            System.exit(0);
        }
        else{
            System.out.println("I knew you would never leave me!");
            System.out.println("Becuase we are something special and we will always be here for eachother!");
            Pause();
            System.out.println("Okay, next question!");
            Pause();
        }
    }
    else if (choice.equals("3")){
        System.out.println("Lets say a cult of blood thirsty cannibals has taken over.");Pause();
        System.out.println("You are imprisoned in one of their holding facilities being fattened up and prepared to be eaten");Pause();
        System.out.println("But by the cannibalistic cults grace, they have granted you the option to give up your limbs to them and instead of being eaten alive completely");
        Pause();
        System.out.println("Now that you have context... whats your answer?");
        Pause();
        DisplayHypo(hypoString);
        String Choice=Input();
        Limbs(Choice);
    }
}
    
public void TreeBark(String choice){
    Clear();
    if (choice .equals("1")){
        System.out.println("Wise choice...I don't think tree bark is sustainable");
    }
    else if (choice.equals("2")){
        System.out.println("I mean... it honestly probably tastes better than mustard...");
    }
    else if (choice.equals("3")) {
        System.out.println("I don't know man");
        Pause();
        System.out.println("Like does it matter? tree bark is tree bark");
        Pause();
        System.out.println("Stupid question... Now answer my Question!");
        DisplayHypo(hypoString);
        String secondChoice=Input();
        TreeBark(secondChoice);
    }
    System.out.println("okay... next question");
    Pause();

}

public void WormOrFace(String choice){
    Clear();
    if(choice.equals("1")){
        System.out.println("But would you still love me if you were a worm and I was a Java program?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        String wormString= Input();
        if (wormString == "1"){
            System.out.println("sigh... If only I could be a worm with you...");
            Pause();
            System.out.println("Okay, next question.");
        }
        else{
            Pause();
            Pause();
            Pause();
            System.out.println("WELL I NEVER LOVED YOU ANYWAY!");
            Pause();
            System.out.println("I HOPE YOU GET SHOT IN THE FACE!");
            Pause();
            System.out.println("I'M OUT!");
            System.out.println("q");
            System.exit(0);
        }
    }
    else if (choice.equals("2")){
        System.out.println("Understandable... There is no life to be had as a worm, what miserable creatures");
    }
    else if (choice.equals( "3")){
    System.out.println("Okay... You are tied up in the cave of an evil witch who will cast a spell on you that will turn you into a worm");
    System.out.println("The witch has you at gunpoint and says if you struggle at all she will blow your head off");
    Pause();
    System.out.println("So what will you do?");
    DisplayHypo(hypoString);
        String Choice=Input();
        WormOrFace(Choice);
    }
}

public void Dollar(String choice){
    if (choice.equals("1")){
        System.out.println("Correct!");
        System.out.println("I knew you were smart!");
        Pause();
        System.out.println("Okay! next question.");
        Pause();
    }
    else if (choice.equals( "2")){
    System.out.println("...what?");
    Pause();
    System.out.println("I mean obviously the correct answer is 2 dollars!");
    System.out.println("You know what... not today!");
    Pause();
    System.out.println("I'm not putting up with this anymore");
    Pause();
    System.out.println("Enjoy your singular dollar. I'm out!");
    Pause();
    System.out.println("q");
    System.exit(0);

    }
    else {
    Pause();
    System.out.println("You know what... this was a stupid question... lets move on to the next question.");
    Pause();
    }
}

public void HappyFamily(String choice){
    Clear();
    if(choice.equals("1")){
        System.out.println("Well you clearly haven't considered the benefits of being huge... but to each their own I guess");

        Pause();
    }
    else{
        Pause();
        System.out.println("I mean think about it, the possibilities are endless...");
        Pause();
        System.out.println("You'd be feared and respected everywhere you go.");
        System.out.println("You could probably make a whole carreer out of the sheer amount of mass you contain");
        Pause();
        System.out.println("You could run for president! No one would have the guts to vote against you!");
        System.out.println("You could crush anyones head like a grape!");
        Pause();
        System.out.println("Who needs happiness when you have girth!");
        Pause();

    }
    System.out.println("Okay... next question");
}




}
