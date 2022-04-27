package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    VirtualPet underTest;


    @BeforeEach
    public void setUp() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
    }

    @Test
    public void shouldReturnHunger() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        int check = underTest.getHunger();
        assertEquals(100, check);
    }

    @Test
    public void shouldReturnDescription() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        String check = underTest.getDescription();
        assertEquals("Fury friend looking for love!", check);
    }

    @Test
    public void shouldReturnName() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        String check = underTest.getName();
        assertEquals("Spike", check);
    }

    @Test
    public void shouldReturnThirsty() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        int check = underTest.getThirsty();
        assertEquals(100, check);
    }

    @Test
    public void shouldReturnBoredom() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        int check = underTest.getBoredom();
        assertEquals(100, check);
    }

    @Test
    public void shouldReturnBathroom() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        int check = underTest.getBathroom();
        assertEquals(100, check);
    }

    @Test
    public void shouldReturnPlayLevel() {
        VirtualPet underTest = new VirtualPet("Spike", "Bulldog", "Fury friend looking for love!", 100, 100, 100, 100, 100);
        int check = underTest.getPlay();
        assertEquals(100, check);
    }
}
