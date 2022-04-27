package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> myPets = new HashMap<>();

    public void add(VirtualPet petsToAdd ) {
        myPets.put(petsToAdd.getName(), petsToAdd);
    }

    public VirtualPet findPet(String petName) {
        return myPets.get(petName);
    }

    public Collection<VirtualPet> getAllPets(String petToRemove) {
        return myPets.values();
    }


    public void adopt(VirtualPet petToRemove) {
        myPets.remove(petToRemove.getName(), petToRemove);
    }

    public void feedAllPets() {
        for (VirtualPet feedAllPet : myPets.values()) {
            feedAllPet.getHunger();
        }
    }

    public void waterAllPets() {
        for (VirtualPet waterAllPet : myPets.values()) {
            waterAllPet.getThirsty();
        }


    }public void tickAllPets(){
        for(VirtualPet tickAllPet : myPets.values()){
            tickAllPet.tick();
        }
    }

    public void showAllPets() {
        for (VirtualPet pet: myPets.values()){
            System.out.println(pet.getName() + " " + pet.getBreed() + " " + pet.getDescription() + " " + pet.getHunger() + " " + pet.getThirsty() + " " + pet.getBoredom() + " " + pet.getBathroom() + " " + pet.getPlay() + " ");
        }
    }

    public void showPetStatus() {
        String petStatus = " ";
        for (Map.Entry<String, VirtualPet> petEntry : myPets.entrySet()) {
            petStatus += petEntry.getValue().getName() + " \t" + petEntry.getValue().getBreed() + " \t" + petEntry.getValue().getDescription() + " \t" + petEntry.getValue().getHunger() + " \t" + petEntry.getValue().getThirsty() + " \t" + petEntry.getValue().getBoredom() + " \t" + petEntry.getValue().getBathroom() + " \t" + petEntry.getValue().getPlay() + " \n";
        }

    }

    public void playWithAllPets(){
        for (VirtualPet platWithAllPets : myPets.values()){
            platWithAllPets.getPlay();
        }
    }

    public void removePet(String name) {
        for (int i = myPets.size()-1; i>=0; i--)
            if (myPets.get(i).getName().equals(name)) {
                myPets.remove(i);
            }

    }

}
