package hw06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    Family family;

    @BeforeEach
    void before() {
        String [][] scheduleOfChild = {
                {DayOfWeek.Monday.name(),"Kill Lois"},
                {DayOfWeek.Friday.name(), "Organize funeral for Lois's death"}
        };
        String[][] scheduleOfFather = {
                {DayOfWeek.Monday.name(), "Go to Clam"}
        };
        String[][] scheduleOfMother = {
                {DayOfWeek.Sunday.name(), "Do the laundry"},
                {DayOfWeek.Friday.name(), "Go to church"}
        };
        String[] habits = {"read books", "write templates for book", "hang up with Stewie"};
        Human mother = new Human("Lois", "Griffin", 1958,65, scheduleOfMother);
        Human father = new Human("Peter", "Griffin", 1956,10, scheduleOfFather);
        ArrayList<Human> children = new ArrayList<>();
        Pet pet = new Pet(Species.DOG,"Brian",10,88, habits);
        Human child = new Human("Stewie","Griffin",1997, 185, scheduleOfChild);
        family = new Family(mother, father, children);
        family.addChild(child);
    }



    @Test
    void countFamily() {
        int actual = family.countFamily();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        String [][] dummySschedule = {
                {DayOfWeek.Monday.name(),"Kill Lois"},
                {DayOfWeek.Friday.name(), "Organize funeral for Lois's death"}
        };
        String[] habits = {"read books", "play music", "hang up with Stewie"};
        Human mother2 = new Human("Barbara", "Pewterschmidt", 1924,122, dummySschedule);
        Human father2 = new Human("Carter", "Pewterschmidt", 1921,99, dummySschedule);
        Pet pet2 = new Pet(Species.CAT,"Cally",5,88, habits);
        Human child2 = new Human("Lois","Griffin",1956, 91, dummySschedule);
        ArrayList<Human> children = new ArrayList<>();
        Family family2 = new Family(mother2,father2, children);

        assertFalse(family.equals(family2));
    }

    @Test
    void testHashCode() {
        assertNotEquals(family.hashCode(), 0);
    }

    @Test
    void testToString() {
        String unExpected = "In this universe there is one big energy and we don't have a name for it";
        System.out.println(family.toString());
        assertNotEquals(unExpected, family.toString());
    }

    @Test
    void getMother() {
        String[][] scheduleOfMother = {
                {DayOfWeek.Sunday.name(), "Make reservation for hotel"},
                {DayOfWeek.Friday.name(), "Start reading bible, again"}
        };
        Human mother2 = new Human("Anna", "Stewart", 1958,65, scheduleOfMother);

        assertFalse(mother2.equals(family.getMother()));
    }

    @Test
    void getFather() {
        String [][] dummySchedule = {
                {DayOfWeek.Monday.name(),"go to Congo"}
        };
        Human anotherHuman = new Human("Ernesto", "Guevara", 1931, 100, dummySchedule);

        assertFalse(anotherHuman.equals(family.getFather()));
    }

    @Test
    void getChildren() {

    }
}