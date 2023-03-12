import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                System.out.println("Homework BouncersInDiscoStory");
                System.out.println("Entrance with young bouncer.");
                System.out.println("Hello, how old are You?");
                Scanner inputReader = new Scanner(System.in);
                String declinMessage = "Sorry, you are not allowed to go to party!";

                int age = inputReader.nextInt();
                System.out.println("Let me know your hight:");
                double hight = inputReader.nextDouble();
                System.out.println("Are You very good singer! True or False?");
                boolean canSing = inputReader.nextBoolean();

                boolean isAllowedToParty = age >= 18 && hight >= 1.90;

                if (isAllowedToParty && canSing) {
                        System.out.println("Have a great time in party!");
                } else {
                        System.out.println(declinMessage);

                        if (isAllowedToParty || canSing) {

                                System.out.println("Older bouncer see your parameters and...");
                                System.out.println("Ok, come in!");
                        }


                }
        }
}



