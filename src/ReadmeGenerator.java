import java.util.Scanner;

public class ReadmeGenerator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String features;
        String contributions;
        String tests;

        while (true) {


            System.out.println("README Generator");

            System.out.println("Please enter your GitHub username to be included in the README.");
            String githubUsername = userInput.next();

            System.out.println("Please enter your email address.");
            String email = userInput.next();

            System.out.println("Enter the title of your application.");
            String title = userInput.next();

            System.out.println("Enter a description for your application.");
            String description = userInput.next();

            System.out.println("Please enter the installation instructions for your application.");
            String installation = userInput.next();

            System.out.println("Enter the usage instructions for your applications.");
            String usage = userInput.next();

            System.out.println("Please enter credit information.");
            String credit = userInput.next();

            System.out.println("Would you like to include a license? (y/n)");
            Character license = userInput.next().charAt(0);
            Boolean includeLicense;

            if (license == 'y') {
                includeLicense = true;
            } else if (license == 'n') {
                includeLicense = false;
            } else {
                System.out.println("Please type a valid entry");
            }




        }
    }
}
