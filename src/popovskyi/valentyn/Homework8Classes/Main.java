package popovskyi.valentyn.Homework8Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            System.out.println("Choose category: 1-Worker or 2-Client");
            //Worker
            if (t == 1) {
                System.out.println("Choose position: 1-Administrator, 2-Trainer, 3-Masseur");
                t = scanner.nextInt();
                //Administrator
                if (t == 1) {
                    System.out.println("Choose option: 1-Create new Administrator, 2-Add new Client, 3-Delete Client");
                    t = scanner.nextInt();
                }
                //Trainer
                if (t == 2) {
                    System.out.println("Choose option: 1-Create new Trainer, 2-Change client's quantity of trainings, 3-Show Trainers");
                    t = scanner.nextInt();
                }
                //Masseur
                if (t == 3) {
                    System.out.println("Choose option: 1-Create new Masseur, 2-Change client's quantity of massage, 3-Show Masseurs");
                    t = scanner.nextInt();
                }
            }
            //Client
            if (t == 2) {
                System.out.println("Choose option: 1-Create new Client, 2-Show Clients");
                t = scanner.nextInt();

            }
        }


    }
}
