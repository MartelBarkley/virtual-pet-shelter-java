package shelter;

import java.util.Locale;
import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter virtualPet = new VirtualPetShelter();

        VirtualPet virtualPet1 = new VirtualPet("Spike", "Bulldog", "Beast mode", 100, 45, 65, 25, 85);
        VirtualPet virtualPet2 = new VirtualPet("Sam", "Maltese", "Blue 42", 50, 47, 10, 25, 100);
        VirtualPet virtualPet3 = new VirtualPet("Winnie", "Chihuahua", "Pretty Brown Eyes", 99, 75, 20, 18, 65);
        VirtualPet virtualPet4 = new VirtualPet("Bathbomb", "German Shepherd", "I am Captain Planet", 100, 100, 100, 100, 100);

        virtualPet.add(virtualPet1);
        virtualPet.add(virtualPet2);
        virtualPet.add(virtualPet3);
        virtualPet.add(virtualPet4);

        String userChoice;

        do {
            System.out.println("Welcome to All Dogs Go To Heaven");
            System.out.println();
            System.out.println("Here are the pets you can choose from");
            System.out.println();
            System.out.println("Name\t| Breed\t| Description\t| Hunger\t| Thirsty\t| Boredom\t| Bathroom\t| Play\t");
            System.out.println("-----\t|-----\t|-------------\t|-------\t|-------\t|--------\t|----------\t|--------");

            virtualPet.showAllPets();
            virtualPet.showPetStatus();

            System.out.println(" To play press 1");
            System.out.println("To water press 2");
            System.out.println("To feed press 3");
            System.out.println("To get status press 4");
            System.out.println("To adopt press 5");
            System.out.println("To admit a pet press 6");
            System.out.println(("To quit press 7"));
            userChoice = input.nextLine();

            while (!userChoice.equals("7")){
                if (userChoice.equals("1")){
                    System.out.println("You want to play your pets, there going to be so happy");
                    virtualPet.playWithAllPets();
                    virtualPet.tickAllPets();

                    System.out.println("Current pet status");
                    virtualPet.showPetStatus();
                    break;
                }else if (userChoice.equals("2")){
                    System.out.println("You want to water your pets, there going to be so happy");
                    virtualPet.waterAllPets();
                    virtualPet.tickAllPets();

                    System.out.println("Current pet status");
                    virtualPet.showPetStatus();
                    break;
                }else if (userChoice.equals("3")){
                    System.out.println("You want to feed your pets, there going to be so happy");
                    virtualPet.feedAllPets();
                    virtualPet.tickAllPets();

                    System.out.println("Current pet status");
                    virtualPet.showPetStatus();
                    break;

                }else if (userChoice.equals("4")){
                    System.out.println("Status Loading.....");
                    virtualPet.showPetStatus();
                    break;

                }else if (userChoice.equals("5")){
                    System.out.println("Congratulations on wanting to adopt");
                    System.out.println("Which pet would you like to adopt");
//                    userChoice = input.nextLine();

                    String petToAdoptName = input.nextLine();
                    VirtualPet petToAdopt = virtualPet.findPet(petToAdoptName);
                    virtualPet.adopt(petToAdopt);

//                    System.out.println("You have adopted " + virtualPet.getAllPets(petToRemove));
//                    virtualPet.removePet(petToRemove);
                    break;

                }else if (userChoice.equals("6")){
                    System.out.println("You want to add a pet to our shelter no problem, what is the pets name?");
                    String petName = input.nextLine();
                    System.out.println("What is your pets breed?");
                    String petBreed = input.nextLine();
                    System.out.println("In a brief summary describe your pet");
                    String petDescription = input.nextLine() .toLowerCase(Locale.ROOT);
                    VirtualPet virtualPet5 = new VirtualPet(petName, petBreed, petDescription, 100,100,100,100,100);
                    virtualPet.add(virtualPet5);
                    System.out.println("We have no problem taking in " + petName + " they are in good hands");
                    break;

                }

            }

        }while (!userChoice.equals("7"));

    }


}