package hw06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human father;

    @BeforeEach
    void before(){
        String[][] scheduleOfFather = {
                {DayOfWeek.Monday.name(), "Go to Clam"}
        };
        father = new Human("Peter", "Griffin", 1956,10, scheduleOfFather);
    }

    @Test
    void testGetName() {
        assertEquals("Peter", father.getName());
    }

    @Test
    void testGetSurname() {
        assertEquals("Griffin", father.getSurname());
    }

    @Test
    void testGetYear() {
        assertNotEquals(1991, father.getYear());
    }

    @Test
    void testGetIq() {
        assertNotEquals(0, father.getIq());
    }

    @Test
    void testGetSchedule() {
        String[][] scheduleOfFather = {
                {DayOfWeek.Monday.name(), "Go to Clam"}
        };
        assertArrayEquals(scheduleOfFather, father.getSchedule());
    }

    @Test
    void testToString() {
        assertNotEquals("Lucky there's a family guy", father.toString());
    }

    @Test
    void testEquals() {
        String[][] scheduleOfAnotherFather = {
                {DayOfWeek.Monday.name(), "Go to Clam"}
        };
        Human anotherFather = new Human("Peter", "Griffin", 1956,10, scheduleOfAnotherFather);
        assertFalse(father.equals(anotherFather));
    }

    @Test
    void testHashCode() {
        int unExpected = 1234567890;
        assertNotEquals(unExpected, father.hashCode());
    }
}