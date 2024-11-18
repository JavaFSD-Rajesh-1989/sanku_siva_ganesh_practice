import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the launch authentication code:");
            String userInputCode = scanner.nextLine();

            AuthenticationMechanism auth = new KeypadAuth("secure123");
            LaunchSystem system = new LaunchSystem(auth);

            if (system.authorize(userInputCode)) {
                System.out.println("Authentication successful.");

                
                system.addWarhead(new ICBM("NorthTarget", 1000));
                system.addWarhead(new CruiseMissile("EastTarget", 500));

                System.out.println("Warheads added. Initiating launch sequence...");
                system.initiateLaunch();
            } else {
                System.out.println("Authentication failed.");
            }
        } catch (Exception e) {
            System.out.println("Launch aborted: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
