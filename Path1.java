public class Path1 extends Base {
   
    public void AllPath1(){
        Welcome();

    }
    String[] topics = { "Bees", "The color blue", "The Stock Market", "Jupiter", "Peanut Butter", "Dogs", "fonts", "The Ocean", "The Human Experience"};

    public void Welcome(){
        System.out.println("Well, what do you want to talk about today?");
        String topic1 = topics[java.util.random.RandomGenerator.getDefault().nextInt(0, topics.length)];
        System.out.println("1. " + topic1);
        String topic2 = topics[java.util.random.RandomGenerator.getDefault().nextInt(0, topics.length)];
        System.out.println("2. " + topic2);
        String topic3 = topics[java.util.random.RandomGenerator.getDefault().nextInt(0, topics.length)];
        System.out.println("3. " + topic3);
        String topic;


        String TopicChoice = Input();

        

        if (TopicChoice.equals("1")){
            topic = topic1;
        }
        else if (TopicChoice.equals("2")){
            topic = topic2;
        }
        else if (TopicChoice.equals("3")){
            topic = topic3;
        }



        if (topic == ""){}

        else if (topic == ""){}

        else if (topic == ""){}
        
        else{
            System.out.println("Really?"+TopicChoice+"? Why would you want to talk about that?");
            Pause();
            System.out.println("Like what do you expect me to say about that?")
        }
    }
}
