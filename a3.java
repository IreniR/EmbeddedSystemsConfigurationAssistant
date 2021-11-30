import java.util.Scanner;

public class a3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("10 Selectable Embedded Systems");
        System.out.println("-------------------------------");
        System.out.println("Raspberry Pi Compute Module 4"); 
        System.out.println("NVIDIA Jetson Nano");
        System.out.println("PocketBeagle");
        System.out.println("Odroid xu4");
        System.out.println("UDOO Bolt v8");
        System.out.println("Asus Tinker Board S");
        System.out.println("Banana Pi M5");
        System.out.println("Nano Pi NEO4");
        System.out.println("Onion Omega 2+");
        System.out.println("Rock Pi 4 Model C");
        System.out.println("-------------------------------");

        

        System.out.println("Would you like a smaller system or a larger system: Enter 1 / 2");
        int v1 = sc.nextInt();

        if (v1 == 1) {

            System.out.println("Would you like the option to have multiple USB ports or single to none: Enter 1 / 2");
            int v3 = sc.nextInt();
            if (v3 == 1) {

                System.out.println(
                        "Would you like a standardized 1G stoage space, or a greater amount: Enter 1 / 2");

                int v5 = sc.nextInt();
                if (v5 == 1) {
                    System.out.println("Nano Pi NEO4");
                } else {

                    System.out.println(
                            "Would you want a more capable GPU, or is it not neccessary: Enter 1 / 2");

                    int v6 = sc.nextInt();
                    if (v6 == 1) {
                        System.out.println("NVIDIA Jetson Nano");
                    } else {

                        System.out.println("Would you want a heatsink, or would it not be necessary: Enter 1 / 2");

                        int v7 = sc.nextInt();
                        if (v7 == 1) {

                            System.out.println("Would you like a cheaper or more expensive model: Enter 1 / 2");

                            int v8 = sc.nextInt();
                            if (v8 == 1) {
                                System.out.println("Rock Pi 4 Model C");
                            } else {
                                System.out.println("Asus Tinker Board S");
                            }
                        } else {

                            System.out.println(
                                    "Would you prefer to have mass storage through SATA, or is it not necessary: Enter 1 / 2");
                            int v9 = sc.nextInt();
                            sc.close();
                            if (v9 == 1) {
                                System.out.println("Banana Pi ");
                            } else {
                                System.out.println("Raspberry Pi Compute Module 4");
                            }
                        }

                    }
                }
            } else {
                System.out.println(
                        "Would you like the option to havr built-in Wi-Fi, or would you prefer using a Wi-Fi dongle: Enter 1 / 2");
                int v4 = sc.nextInt();

                if (v4 == 1) {
                    System.out.println("Onion Omega2+");

                } else {
                    System.out.println("PocketBeagle");
                }
            }
        } else {
            System.out.println("Would you like to have a cooling agent or a cooling fan");

            int v2 = sc.nextInt();
            if (v2 == 1) {

                System.out.println("Odroid xu4");
            } else {
                System.out.println("UDOO Bolt v8");
            }
        }
    }
}
