package shelter;

public class VirtualPet {

    private String name;
    private String breed;
    private String description;
    private int hunger;
    private int thirsty;
    private int boredom;
    private int bathroom;
    private int play;


    public VirtualPet(String name, String breed, String description, int hunger, int thirsty, int boredom, int bathroom, int play) {
        this.name = name;
        this.breed = breed;
        this.description = description;
        this.hunger = hunger;
        this.thirsty = thirsty;
        this.boredom = boredom;
        this.bathroom = bathroom;
        this.play = play;
    }

    public int getHunger() {
        return hunger;
    }
    public String getBreed(){
        return breed;
    }

    public String getDescription() {
        return  description;
    }

    public String getName() {
        return  name;
    }

    public int getThirsty() {
        return  thirsty;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public int getPlay() {
        return play;
    }

    public void tick(){
        hunger += 1;
        thirsty += 2;
        boredom +=1;
        bathroom += 2;
        play += 1;
    }

    public void feedingPet() {
        hunger += 2;
        thirsty -= 3;
        play -= 2;
    }

    public void wateringPet(){
        thirsty += 1;
        bathroom -= 2;
    }

    public void bathroomBreak(){
        bathroom += 4;

    }

    public void boredom(){
        play += 1;
    }

    public void letPlay(){
        thirsty -= 1;
        hunger -= 4;
    }
}