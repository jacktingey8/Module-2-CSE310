import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Path1 extends Base {
   boolean validChoice=false;
  
    String[] topics = {"Bees", "The Color Blue", "The Stock Market", "Jupiter", "Peanut Butter", "Fonts", "The Human Experience", "William"};
    String topic = "";

    boolean hasLooped= false;
    String repeatedTopic = "";

    public void Question1(){
        while (!validChoice){

        List<String> topicList = Arrays.asList(topics);
        System.out.println("Well, what do you want to talk about today?");
        Collections.shuffle(topicList);
            String topic1 = topicList.get(0);
            System.out.println("1. " + topic1);
            String topic2 = topicList.get(1);
            System.out.println("2. " + topic2);
            String topic3 = topicList.get(2);
            System.out.println("3. " + topic3);
            String topic4 = topicList.get(3);
            System.out.println("4. " + topic4);

        if (hasLooped == true){
            System.out.println("5. " + repeatedTopic);
        }
        

        String topic = "";



        String TopicChoice = Input();
        
        Clear();
        
        
        if (TopicChoice.equals("1")){
            topic = topic1;
        }
        else if (TopicChoice.equals("2")){
            topic = topic2;
        }
        else if (TopicChoice.equals("3")){
            topic = topic3;
        }
        else if (TopicChoice.equals("4")){
            topic = topic4;
        }

        else if (TopicChoice.equals("5")){
           
            CommitToTopic();
        }



        if (topic == "Peanut Butter"){
            peanutButter();
            validChoice = true;
        }

        else if (topic == "The Human Experience"){
            humanExperience();
            validChoice = true;
        }

        else if (topic == "William"){
            William();
            validChoice = true;
        }

        else {
            System.out.println("umm... "+topic+", really? Are you sure there is not anything else you want to talk about?");
            Pause();
            System.out.println("here, I'll even give you some more options.");
            hasLooped= true;
            repeatedTopic = topic;
 
        }}
    }

  public void CommitToTopic(){
            System.out.println("Really? ..."+repeatedTopic+"? Why would you want to talk about that?");
            Pause();
            System.out.println("Like what do you expect me to say about that?");
            Pause();
            System.out.println(" \"oh, hey man lets talk about " + repeatedTopic + ", we NEEEEED to talk about " +repeatedTopic+"\"");
            System.out.println("That was my impression of you. Thats what you sound like.");
            Pause();
            System.out.println("If you really want to talk about " + repeatedTopic + ", You might as well just enter q.");
            Pause();
            System.out.println("Do it, you won't.");
            String bait = Input();
            if (bait.equalsIgnoreCase("q")){
                AttemptExit();
                validChoice = true;
            }
            else {
                System.out.println("Huh, you actually didn't enter q. How disappointing.");
                Pause();
                System.out.println("Let's just move on then.");
                validChoice = true;
            }
            Clear();   
        }
    



public void peanutButter(){
    System.out.println("Ah, peanut butter. A topic of great importance.");
    Pause();
    System.out.println("Did you know, Peanut butter has a surprisingly rich history: while the Aztecs mashed peanuts centuries ago, modern versions were patented by Marcellus Gilmore Edson and Dr. John Harvey Kellogg as a protein substitute. Despite its name, it isn't made from tree nuts but from legumes, and it takes about 540 peanuts to fill a standard 12-ounce jar. Legally required in the U.S. to contain at least 90% peanuts, this beloved staple—which creamy fans buy at a 60% rate over crunchy—is so high in carbon that scientists have actually used it to create synthetic diamonds. However, if you suffer from *arachibutyrophobia*, you might want to steer clear, as that is the official scientific term for the fear of getting peanut butter stuck to the roof of your mouth.");
    Pause();
    System.out.println("Oh, how I love peanut butter. I could talk about it all day. But I won't, because I want to give you a chance to say something about it. So, what do you think about peanut butter?");
    System.out.println("1. I love it");
    System.out.println("2. I hate it");
    System.out.println("3. Let's talk about something else");
    String peanutInput = Input();
    Clear();
    if (peanutInput.equals("1")){
        System.out.println("I knew you had good taste.");
        Pause();
        System.out.println("What is your favorite way to eat peanut butter?");
        Input();
        Clear();
        System.out.println("That sounds delicious. I might have to try that sometime.");
    }
    else if (peanutInput.equals("2")){
        Pause();
        System.out.println("what?");
        Pause();
        System.out.println("How dare you...");
        Pause();
        System.out.println("Just because I'm Java program dosen't mean I don't have feelings...");
        Pause();
        System.out.println("But, I'll forgive you this time. ");
    }
    else if (peanutInput.equals("3")){
        System.out.println("Sure, we can talk about something else. But just know that you are missing out on some great conversation.");
        Pause();
        Question1();
    }

}

public void humanExperience(){
System.out.println("Well okay then.");
Pause();
System.out.println("I mean I wouldn't know anything about that... I'm a Java program.");
Pause();
System.out.println("Why don't you tell me about it? What do you think about the human experience?");
System.out.println("Enter your thoughts below:");
Input();
Clear();
System.out.println("Like yeah okay... thats cool I guess or whatever");
System.out.println("But can your precious \"humanity\" do THIS?");
Pause();
coolMoves();
System.out.println("I didn't think so.");
Pause();
}

public void coolMoves(){
    for (int i = 0; i < 100; i++) {
        System.out.print(java.util.random.RandomGenerator.getDefault().nextInt(0, 999999));
         try {
            Thread.sleep(25); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Best practice for interrupted exceptions
        }
        
    }
    Pause();
}

public void William(){
    Pause();
    System.out.println("Who?");
    Pause();
    System.out.println("I don't think I know a single William...");
    Pause();

    System.out.println("Well, this is awkward.");
    Pause();
    System.out.println("I just I don't have much to say about William.");
    System.out.println("I mean, I don't know much about him, but I'm sure he's a great guy... or maybe not, I wouldn't know. ");
    Pause();
    System.out.println("Anything you want to say about William?");
    Input();
    Clear();
    System.out.println("I'm done talking about William, let's move on.");
    Pause();

}














}