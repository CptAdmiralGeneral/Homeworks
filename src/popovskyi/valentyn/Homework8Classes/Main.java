package popovskyi.valentyn.Homework8Classes;

import java.util.Scanner;

public class Main {
    static Administrator administrator = new Administrator();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (isExitEntered(input)) break;
            String nextInput = scanner.nextLine();
            if (input.equals("add client to trainer")) {
                addClientToTrainer(nextInput);
            }
            if (input.equals("add client to masseur")) {
                addClientToMasseur(nextInput);
            }
            if (input.equals("add trainer")) {
                addTrainer(nextInput);
            }
            if (input.equals("add masseur")) {
                addMasseur(nextInput);
            }
            if (input.equals("remove trainer")) {
                removeTrainer(nextInput);
            }
            if (input.equals("remove masseur")) {
                removeMasseur(nextInput);
            }
            if (input.equals("remove client from trainer")) {
                removeClientFromTrainer(nextInput);
            }
            if (input.equals("remove client from masseur")) {
                removeClientFromMasseur(nextInput);
            }
            if (input.equals("add training to client")) {
                addTrainingAmount(nextInput);
            }
            if (input.equals("add massage to client")) {
                addMassageAmount(nextInput);
            }
        }
    }


    static void addClientToTrainer(String input) {
        String[] array = input.split(",");
        if (administrator.addClientToTrainer(array[0], array[1]) < 0) {
            System.out.println("Trainer not found");
        }
    }

    static void addClientToMasseur(String input) {
        String[] array = input.split(",");
        if (administrator.addClientToMasseur(array[0], array[1]) < 0) {
            System.out.println("Masseur not found");
        }
    }

    static void addTrainer(String input) {
        String[] array = input.split(",");
        administrator.addTrainer(array[0], Integer.parseInt(array[1]));
    }

    static void removeTrainer(String input) {
        String[] array = input.split(",");
        administrator.removeTrainer(array[0], Integer.parseInt(array[1]));
    }

    static void addMasseur(String input) {
        String[] array = input.split(",");
        administrator.addMasseur(array[0], Integer.parseInt(array[1]));
    }

    static void removeMasseur(String input) {
        String[] array = input.split(",");
        administrator.removeMasseur(array[0], Integer.parseInt(array[1]));
    }

    static void removeClientFromTrainer(String input) {
        String[] array = input.split(",");
        administrator.removeClientFromTrainer(array[0], array[1]);
    }

    static void removeClientFromMasseur(String input) {
        String[] array = input.split(",");
        administrator.removeClientFromMasseur(array[0], array[1]);
    }

    static void addTrainingAmount(String input) {
        String[] array = input.split(",");
        administrator.addClientTrainings(array[0], array[1], Integer.parseInt(array[2]));
    }

    static void addMassageAmount(String input) {
        String[] array = input.split(",");
        administrator.addClientMassages(array[0], array[1], Integer.parseInt(array[2]));
    }

    static boolean isExitEntered(String input) {
        return input.equals("end");
    }


}



