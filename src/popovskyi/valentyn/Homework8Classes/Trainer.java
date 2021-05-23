package popovskyi.valentyn.Homework8Classes;

import java.util.HashSet;
import java.util.Set;

public class Trainer extends Person {
    Set<Client> clients = new HashSet<>();

    Trainer(String trainerName, int exp) {
        name = trainerName;
        yearOfExperience = exp;
    }

    public void addClient(String clientName) {
        Client newClient = new Client(clientName);
        clients.add(newClient);
    }

    public void removeClient(String clientName) {
        Client newClient = new Client(clientName);
        clients.remove(newClient);
    }

    public void addTraining(String clientName, int amountOfTraining) {
        for (Client c : clients) {
            if (c.name.equals(clientName)) {
                c.trainings = amountOfTraining;
            }
        }

    }
}

