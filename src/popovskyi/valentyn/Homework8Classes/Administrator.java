package popovskyi.valentyn.Homework8Classes;

import java.util.HashSet;
import java.util.Set;

public class Administrator {
    Set<Trainer> trainers = new HashSet<>();
    Set<Masseur> masseurs = new HashSet<>();

    public int addClientToTrainer(String trainerName, String clientName) {
        for (Trainer t : trainers) {
            if (t.name.equals(trainerName)) {
                t.addClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public int removeClientFromTrainer(String trainerName, String clientName) {
        for (Trainer t : trainers) {
            if (t.name.equals(trainerName)) {
                t.removeClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public int removeClientFromMasseur(String masseurName, String clientName) {
        for (Masseur m : masseurs) {
            if (m.name.equals(masseurName)) {
                m.removeClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public int addClientToMasseur(String masseurName, String clientName) {
        for (Masseur m : masseurs) {
            if (m.name.equals(masseurName)) {
                m.addClient(clientName);
                return 0;
            }
        }
        return -1;
    }

    public void addTrainer(String trainerName, int yearOfExperience) {
        Trainer newTrainer = new Trainer(trainerName, yearOfExperience);
        trainers.add(newTrainer);
    }

    public void removeTrainer(String trainerName, int yearOfExperience) {
        Trainer newTrainer = new Trainer(trainerName, yearOfExperience);
        trainers.remove(newTrainer);
    }

    public void addMasseur(String masseurName, int yearOfExperience) {
        Masseur newMasseur = new Masseur(masseurName, yearOfExperience);
        masseurs.add(newMasseur);
    }

    public void removeMasseur(String masseurName, int yearOfExperience) {
        Masseur newMasseur = new Masseur(masseurName, yearOfExperience);
        masseurs.remove(newMasseur);
    }


    public void addClientTrainings(String trainerName, String clientName, int amountOfTrainings) {
        for (Trainer t : trainers) {
            if (t.name.equals(trainerName)) {
                t.addTraining(clientName, amountOfTrainings);
            }
        }
    }

    public void addClientMassages(String masseurName, String clientName, int amountOfMassages) {
        for (Masseur m : masseurs) {
            if (m.name.equals(masseurName)) {
                m.addMassage(clientName, amountOfMassages);
            }
        }
    }
}
