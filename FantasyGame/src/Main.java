import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Character warrior = new Warrior("Thorin", 150, 30, 20);
            Character dragon = new Dragon("Smaug", 200, 50, 40);

            Equipment sword = new Sword("Excalibur", 50);

            System.out.println("Equip Thorin with a Sword? (yes/no)");
            String equipChoice = scanner.nextLine();
            if (equipChoice.equalsIgnoreCase("yes")) {
                sword.equip(warrior);
                System.out.println("Thorin equipped with Excalibur!");
            } else {
                System.out.println("Thorin is unarmed!");
            }

            while (warrior.isAlive() && dragon.isAlive()) {
                System.out.println("\nThorin's Turn:");
                System.out.println("Choose action: (1) Attack, (2) Use Ability");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Thorin attacks Smaug!");
                    dragon.takeDamage(warrior.getAttackPower());
                } else if (choice == 2) {
                    System.out.println("Thorin uses Dragon Slayer ability!");
                    warrior.useAbility(dragon);
                } else {
                    System.out.println("Invalid choice! Thorin misses his turn.");
                }

                if (dragon.isAlive()) {
                    System.out.println("\nSmaug's Turn:");
                    System.out.println("Smaug attacks Thorin!");
                    dragon.useAbility(warrior);
                }

                System.out.println("\nHealth Status:");
                System.out.println("Thorin: " + warrior.getHealth());
                System.out.println("Smaug: " + dragon.getHealth());
            }

            System.out.println(warrior.isAlive() ? "Warrior wins!" : "Dragon wins!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
}
