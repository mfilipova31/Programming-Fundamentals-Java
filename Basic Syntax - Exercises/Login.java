package BasicSyntaxConditionalsLoops.Exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        //Въвеждане на парола = username на обратно
        String correctPassword = "";

        //всяка позиция в текста, от последната към първата
        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSymbol = username.charAt(position);
            correctPassword += currentSymbol;
        }

        String loggedPassword = scanner.nextLine();

        int failedLogs = 0;
        while (!loggedPassword.equals(correctPassword)){
            failedLogs ++;
            if (failedLogs == 4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            loggedPassword = scanner.nextLine();
        }

        if (loggedPassword.equals(correctPassword)){
            System.out.printf("User %s logged in.", username);
        }

    }
}