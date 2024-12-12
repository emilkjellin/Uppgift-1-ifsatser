import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*  int login = 0;
        int räkna = 5;
        if (räkna >= 3 && räkna <= 6) {
            System.out.println("Hello world!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        if (Objects.equals(userName, "noname") && Objects.equals(password, "123")) {
            System.out.println("welcome " + userName);
            login = 0;
        } else {
            System.out.println("not welcome " + userName);
            login = 1;
        }
        for (int  i = 0; i < 32; i++)
        {
            System.out.println("hello world");
        }
        while (login == 1)
        {
            System.out.println("hello world");
        }
        for (int i = 0; i < 5; i++){
            System.out.println("säg ett tal");
            int number = scanner.nextInt();
            if (number > 5)
            {
                System.out.println("högre än fem");
            }
        }
       boolean findint = true;
       Scanner sc = new Scanner(System.in);
        while (findint)
        {
            try {
                System.out.println("Enter an integer.");

                int num = sc.nextInt();
                findint = false;
            }
            catch (InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Idiot");
            }


        }*/
        boolean findnum = true;
        Scanner sc = new Scanner(System.in);
        Random randnum = new Random();
        int rand = randnum.nextInt(10);
        while (findnum)
        {
            try {

                System.out.println("guess the right number between 0-10.");
                int num = sc.nextInt();
              if (num == rand)
              {
                  findnum = false;
              }
              else if (num < rand)
              {
                  System.out.println("Try higher number");
              }
              else if (num > rand)
              {
                  System.out.println("Try lower number");
              }
            }
            catch (InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "Every girl wants to dance with you\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "I'm the kind of person you'll need a year to win over\n" +
                        "\n" +
                        "[Chorus: Betsy]\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "Every girl wants to dance with you\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "I'm the kind of person you'll need a year to win over\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "Every girl wants to dance with you\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "I'm the kind of person you'll need a year to win over\n" +
                        "\n" +
                        "[Verse: Betsy]\n" +
                        "(Betsy, Betsy, Betsy) Betsy Jared, babe's like Leto, Betsy is summer like heat (Uh!)\n" +
                        "So a sweet boy's gonna jump and burn (Aha)\n" +
                        "Get inside my Bentley, come inside my beauty box (Come on)\n" +
                        "You're my sigma boy, but I want your tears (Got it?)\n" +
                        "Sigma, sigma boy, back on the table, I'm reaching for the bank roll\n" +
                        "I'll buy all the Skittles, Snickers, you'll be mine for sure, boy\n" +
                        "Sigma, sigma boy, I'm the icon of your icons\n" +
                        "They dream about me as if I were bitcoin (Got it?)\n" +
                        "You might also like\n" +
                        "Бэтси (Betsy) & Мария Янковская (Maria Yankovskaya) - Сигма Бой (Sigma Boy) [Romanized]\n" +
                        "Genius Romanizations\n" +
                        "Сигма Бой (Sigma Boy)\n" +
                        "Бэтси (Betsy) & Мария Янковская (Maria Yankovskaya)\n" +
                        "Sigma Boy*\n" +
                        "Lavinia & Ely Oaks\n" +
                        "[Bridge: Maria Yankovskaya]\n" +
                        "Sigma, sigma boy, but not mine, silent as a mute\n" +
                        "Staring into nothing, oh, what a guy, that look is fire\n" +
                        "Years will wait for you to get it together\n" +
                        "And you'll get me someday\n" +
                        "\n" +
                        "[Chorus: Betsy]\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "Every girl wants to dance with you\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "I'm the kind of person you'll need a year to win over\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "Every girl wants to dance with you\n" +
                        "Sigma, sigma boy, sigma boy, sigma boy\n" +
                        "I'm the kind of person you'll need a year to win over");
            }


        }


    }


}