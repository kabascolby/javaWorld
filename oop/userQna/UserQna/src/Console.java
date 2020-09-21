import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    // public static String question(String prompt){
    //     return scanner.nextLine().trim();
    // }

    public static String question(String prompt, String regex, String answer, String message){
        private String response;
        while(true) {
            System.out.print(prompt + ": " + answer);
            response = scanner.nextLine().trim();
            if(response.matches(regex))
                break;
            System.out.println(message);
        }
        return response;
    }
}
