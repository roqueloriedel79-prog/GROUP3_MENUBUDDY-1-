//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Group3_ICT1M2;

import java.util.Scanner;

public class Group3_ICT1M2 {
    public static final String RESET = "\u001b[0m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";

    public static void loadingScreen() {
        System.out.println("\n\n\n");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t██╗      ██████╗  █████╗ ██████╗ ██╗███╗   ██╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t██║     ██╔═══██╗██╔══██╗██╔══██╗██║████╗  ██║██╔════╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t██║     ██║   ██║███████║██║  ██║██║██╔██╗ ██║██║  ███╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t██║     ██║   ██║██╔══██║██║  ██║██║██║╚██╗██║██║   ██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t███████╗╚██████╔╝██║  ██║██████╔╝██║██║ ╚████║╚██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚═╝╚═╝  ╚═══╝ ╚═════╝ \u001b[0m");
        System.out.println("\u001b[31m\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tInitializing MENU BUDDY System... Please wait!\n\u001b[0m");
        System.out.print("\u001b[34m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t[");

        for(int i = 0; i < 43; ++i) {
            try {
                Thread.sleep(40L);
                System.out.print("\u001b[33m█\u001b[0m");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\u001b[34m]\u001b[0m");
        System.out.println("\u001b[32m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSystem Ready ✔\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tLoading Complete — Launching MENU BUDDY\u001b[0m");

        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void welcomeScreen() {
        System.out.println("\u001b[36m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t==================================================================================\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t███    ███ ███████ ███    ██ ██    ██     ██████  ██    ██ ██████  ██████  ██    ██\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t████  ████ ██      ████   ██ ██    ██     ██   ██ ██    ██ ██   ██ ██   ██  ██  ██ \u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t██ ████ ██ █████   ██ ██  ██ ██    ██     ██████  ██    ██ ██   ██ ██   ██   ████  \u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t██  ██  ██ ██      ██  ██ ██ ██    ██     ██   ██ ██    ██ ██   ██ ██   ██    ██ \u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t██      ██ ███████ ██   ████  ██████      ██████   ██████  ██████  ██████     ██   \u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t==================================================================================\u001b[0m");
        System.out.println("\u001b[33m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to MENU BUDDY — Your All-in-One Handy Tool!\u001b[0m");
        System.out.println("\u001b[32m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCalculator | Conversion | Odd/Even | About Us\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDeveloped by Group 3 - ICT 1M2 \ud83d\udcbb\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t==================================================================================\u001b[0m");
    }

    public static void calculator(Scanner sc) {
        System.out.println("\u001b[35m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--- CALCULATOR ---\u001b[0m");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. Addition\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Subtraction\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3. Multiplication\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4. Division");
        System.out.print("\u001b[31m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter choice: ");
        int choice = sc.nextInt();
        System.out.print("\u001b[33m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter first number: ");
        double a = sc.nextDouble();
        System.out.print("\u001b[33m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter second number: ");
        double b = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("\u001b[34m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tResult = " + (a + b) + "\u001b[0m");
                break;
            case 2:
                System.out.println("\u001b[34m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tResult = " + (a - b) + "\u001b[0m");
                break;
            case 3:
                System.out.println("\u001b[34m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tResult = " + a * b + "\u001b[0m");
                break;
            case 4:
                if (b != (double)0.0F) {
                    System.out.println("\u001b[32mResult = " + a / b + "\u001b[0m");
                } else {
                    System.out.println("\u001b[31mError: Division by zero!\u001b[0m");
                }
                break;
            default:
                System.out.println("\u001b[31mInvalid choice!\u001b[0m");
        }

    }

    public static void conversion(Scanner input) {
        System.out.println("\u001b[34m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t--- CONVERSION ---\u001b[0m");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1. mm/cm/m Conversion\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Odd or Even\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3. Area & Circumference of Circle");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter Number (in mm): ");
                double mm = input.nextDouble();
                double cm = mm / (double)10.0F;
                double m = mm / (double)1000.0F;
                System.out.println("\u001b[34m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tConversion Result:\u001b[0m");
                System.out.printf("\u001b[32m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%-10s : %.4f mm%n", "Millimeter", mm);
                System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%-10s : %.4f cm%n", "Centimeter", cm);
                System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%-10s : %.4f m%n\u001b[0m", "Meter", m);
                break;
            case 2:
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter a number: ");
                int num = input.nextInt();
                if (num % 2 == 0) {
                    System.out.println("\u001b[32m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + num + " is Even.\u001b[0m");
                } else {
                    System.out.println("\u001b[32m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + num + " is Odd.\u001b[0m");
                }
                break;
            case 3:
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter radius: ");
                double r = input.nextDouble();
                double area = Math.PI * r * r;
                double circumference = (Math.PI * 2D) * r;
                System.out.printf("\u001b[32m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tArea           : %.4f%n", area);
                System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCircumference  : %.4f%n\u001b[0m", circumference);
                break;
            default:
                System.out.println("\u001b[31m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tInvalid choice!\u001b[0m");
        }

    }

    public static void aboutUs() {
        System.out.println("\n\n\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔══════════════════════════════════════════════════════════════════════════════╗\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║\t\t\t\t\t\t\t\t   \ud83c\udf1f ABOUT US \ud83c\udf1f\t\t\t\t\t\t\t   ║\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚══════════════════════════════════════════════════════════════════════════════╝\u001b[0m");
        System.out.println("\n\u001b[33m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to \u001b[36mMENU BUDDY!\u001b[33m — your all-in-one menu-driven helper app.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWe are \u001b[32mGroup 3 - ICT 1M2\u001b[33m, passionate about making coding interactive,");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\teducational, and fun for students learning Java programming.\n\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t───────────────────────────────\u001b[0m");
        System.out.println("\u001b[32m \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ud83d\udc68\u200d\ud83d\udcbb  DEVELOPERS:\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    • AYO\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    • ROQUE\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    • HICANA\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    • TROPEL\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    • ANDAYA\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    • MAMANGUN\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t───────────────────────────────\n\u001b[0m");
        System.out.println("\u001b[33m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ud83e\udde9 PROJECT TITLE:\u001b[0m  \u001b[36mMENU BUDDY (^_−)/\u001b[0m");
        System.out.println("\n\u001b[32m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ud83d\udcac Our Vision:\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t    To blend creativity and functionality through simple, student-friendly programs.");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    MENU BUDDY is not just a tool — it’s a study companion that makes learning fun!\u001b[0m");
        System.out.println("\n\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╔══════════════════════════════════════════════════════════════════════════════╗\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t║\t\t   ✨ Smart • Simple • Stylish — That’s MENU BUDDY! ✨\t\t\t\t   ║\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t╚══════════════════════════════════════════════════════════════════════════════╝\u001b[0m");
    }

    public static void exitMessage() {
        System.out.println("\u001b[36m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t==============================================\u001b[0m");
        System.out.println("\u001b[32m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tThank you for using MENU BUDDY! \ud83d\udc9a\u001b[0m");
        System.out.println("\u001b[33m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWe hope to see you again soon! \ud83d\ude0a\u001b[0m");
        System.out.println("\u001b[35m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDeveloped by Group 3 - ICT 1M2\u001b[0m");
        System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t==============================================\u001b[0m");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadingScreen();
        welcomeScreen();

        while(true) {
            System.out.println("\u001b[36m\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t======================\u001b[0m");
            System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|      MAIN MENU     |\u001b[0m");
            System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|   (1) Calculator   |\u001b[0m");
            System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|   (2) Conversion   |\u001b[0m");
            System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|   (3) About Us     |\u001b[0m");
            System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|   (4) Exit         |\u001b[0m");
            System.out.println("\u001b[36m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t======================\u001b[0m");
            System.out.print("\u001b[33m\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tEnter your choice: \u001b[0m");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    calculator(sc);
                    break;
                case 2:
                    conversion(sc);
                    break;
                case 3:
                    aboutUs();
                    break;
                case 4:
                    exitMessage();
                    sc.close();
                    return;
                default:
                    System.out.println("\u001b[31mInvalid choice! Try again.\u001b[0m");
            }
        }
    }
}
