package hw06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    Pet pet;

    @BeforeEach
    void before(){
        String[] habits = {"read books", "write templates for book", "hang up with Stewie"};
        pet = new Pet(Species.DOG,"Brian",10,88, habits);
    }

    @Test
    void getNickname() {
        assertEquals("Brian", pet.getNickname());
    }

    @Test
    void getSpecies() {
        assertNotEquals(Species.CAT, pet);
    }

    @Test
    void getAge() {
        assertNotEquals(12, pet.getAge());
    }

    @Test
    void getTrickLevel() {
        assertEquals(88, pet.getTrickLevel());
    }
}