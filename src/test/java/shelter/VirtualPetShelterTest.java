package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;
    private String petToRemove;

    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        pet2 = new VirtualPet("Fiona", "English Springer", "She's likes long walks on the beach!", 100, 100, 100, 100, 100);
    }

    @Test
    public void shouldBeAbleToAddPet() {
        underTest.add(pet1);
        VirtualPet retrievedPet = underTest.findPet("Spike");
        assertEquals(retrievedPet, pet1);
    }

//    @Test
//    public void shouldBeAbleToAddPetsToShelter(){
//        underTest.add(pet1);
//        underTest.add(pet2);
//        Collection<VirtualPet> allPets = underTest.getAllPets(petToRemove);
//        assertThat(allPets, contains(pet1, pet2));
//    }
//
//    @Test
//    public void shouldBeAbleToRemovePetAfterAdoption(){
//        underTest = new VirtualPetShelter();
//        pet1 = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
//        pet2 = new VirtualPet("Fiona", "English Springer", "She's likes long walks on the beach!", 100, 100, 100, 100, 100);
//        underTest.add(pet1);
//        underTest.add(pet2);
//        underTest.removePet("Spike");
//        Collection<VirtualPet> allPets = underTest.getAllPets(petToRemove);
//        assertThat(allPets, contains(pet1));

//        underTest.add(pet1);
//        underTest.close(pet1);
//        VirtualPet retrievedPet = underTest.findPet(pet1.getName());
//        assertEquals(retrievedPet, null);
//    }

    @Test
    public void shouldBeAbleToFeedAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        pet2 = new VirtualPet("Fiona", "English Springer", "She's likes long walks on the beach!", 100, 100, 100, 100, 100);
        underTest.feedAllPets();
        int pet1Hunger = pet1.getHunger();
        int pet2Hunger = pet2.getHunger();
        assertEquals(100, pet1Hunger);
        assertEquals(100, pet2Hunger);
    }

    @Test
    public void shouldBeAbleToWaterAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        pet2 = new VirtualPet("Fiona", "English Springer", "She's likes long walks on the beach!", 100, 100, 100, 100, 100);
        underTest.waterAllPets();
        int pet1Thirsty = pet1.getThirsty();
        int pet2Thirsty = pet2.getThirsty();
        assertEquals(100, pet1Thirsty);
        assertEquals(100, pet2Thirsty);
    }
}
