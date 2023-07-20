import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadmeGenerator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);



        while (true) {




            System.out.println("README Generator");

            System.out.println("Please enter your GitHub username to be included in the README.");
            String githubUsername = userInput.next();
            String[] userInputList = new String[];

            System.out.println("Please enter your email address.");
            String email = userInput.next();
            userInputList.push(email);

            System.out.println("Enter the title of your application.");
            String title = userInput.next();
            userInputList.push(title);

            System.out.println("Enter a description for your application.");
            String description = userInput.next();
            userInputList.push(description);

            System.out.println("Please enter the installation instructions for your application.");
            String installation = userInput.next();
            userInputList.push(installation);

            System.out.println("Enter the usage instructions for your applications.");
            String usage = userInput.next();
            userInputList.push(usage);


            System.out.println("Please enter credit information.");
            String credit = userInput.next();
            userInputList.push(credit);


            System.out.println("Would you like to include a license? (y/n)");
            Character license = userInput.next().charAt(0);
            Boolean includeLicense = null;
            int licenseNumber;
            String features = null;

            if (license == 'y') {
                includeLicense = true;
            } else if (license == 'n') {
                includeLicense = false;
            } else {
                System.out.println("Please type a valid entry");
            }

            if (includeLicense == true) {
                System.out.println("Please choose a license: 1. Apache 2.0, 2. BSD 3-Clause, 3. BSD 2-Clause, 4. GPL v3, 5. GPL v2, 6. AGPL v3, 7. LGPL v3, 8. Unlicense, 9. The Do What the Fuck You Want to Public License, 10. MIT");
                licenseNumber = userInput.nextInt();
            } else {
                System.out.println("Explain any features included in your application.");
                features = userInput.next();
            }

            if (features == null) {
                System.out.println("Explain any features included in your application");
                features = userInput.next();
            } else {
                return;
            }



            System.out.println("Please explain how other developers can contribute to your projects.");
            String contribute = userInput.next();
            userInputList.push(contribute);

            System.out.println("Please list the tests for your application.");
            String tests = userInput.next();
            userInputList.push(tests);


            try {
                File userContent = new File("../dist/README.md");
                if (userContent.createNewFile()) {
                    System.out.println("File created: " + userContent.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException exception) {
                System.out.println("An error occurred.");
                exception.printStackTrace();
            }

            try {
                FileWriter readmeWriter = new FileWriter("../dist/README.md", true);

                int i;
                for ( i = 0; i < userInputList.length; i++) {
                    readmeWriter.write(userInputList[i]);
                }

//                readmeWriter.write(githubUsername);
//                readmeWriter.write(email);
//                readmeWriter.write(title);
//                readmeWriter.write(description);
//                readmeWriter.write(installation);
//                readmeWriter.write(usage);
//                readmeWriter.write(credit);
//                readmeWriter.write("license information");
//                readmeWriter.write(features);
//                readmeWriter.write(contribute);
//                readmeWriter.write(tests);

            } catch (IOException exception) {
                System.out.println("An error ocurred.");
                exception.printStackTrace();
            }

        }
    }
}
