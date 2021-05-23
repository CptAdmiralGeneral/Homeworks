package popovskyi.valentyn.Homework8Classes;

import java.util.HashSet;
import java.util.Set;

public class Masseur extends Person {
    Set<Client> clients = new HashSet<>();

    Masseur(String masseurName, int exp) {
        name = masseurName;
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

    public void addMassage(String clientName, int amountOfMassage) {
        for (Client c : clients) {
            if (c.name.equals(clientName)) {
                c.massages = amountOfMassage;
            }
        }

    }
}


