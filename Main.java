public class Main {
  public static void main(String[] args) {
    int randomNum = java.util.random.RandomGenerator.getDefault().nextInt(0, 4);
    System.out.println(randomNum);

    Base base = new Base();
    base.Welcome();
    base.Pause();

    System.out.println("Hello World");
    System.out.println(base.Input());

















  }
}