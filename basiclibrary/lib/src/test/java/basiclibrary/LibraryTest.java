/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void test_add() {
        Library sut = new Library();
        int numOne = 4;
        int numTwo = 5;
        assertEquals(9, sut.add(numOne, numTwo), "addition() add more ");
    }

    @Test void test_roll() {
        Library sut = new Library();
        System.out.println("roll() Die rolls: " + Arrays.toString(sut.roll(4)));
    }

    @Test void test_containsDuplicates(){
        Library sut = new Library();
        int [] arr = {1,2,3};
        System.out.println("containsDuplicates() Non duplicate array test: " + sut.containsDuplicates(arr));
        assertFalse(sut.containsDuplicates(arr), "roll() add more");
        int [] arrDuplicate = {3,6,8,2,8,7};
        System.out.println("containsDuplicates() Duplicate array test: " + sut.containsDuplicates(arrDuplicate));
        assertTrue(sut.containsDuplicates(arrDuplicate), "roll()");
    }

    @Test void test_arrayOfArrays(){
        Library sut = new Library();
        double[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("Array of Arrays: " + sut.arrayOfArrays(weeklyMonthTemperatures));
        assertEquals(60.25, sut.arrayOfArrays(weeklyMonthTemperatures), "arrayOfArrays () Yo you're broke and need to add stuff");

    }

    @Test void test_minMaxTem_getMin_getMax(){
        Library sut = new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        sut.minMaxTemp(weeklyMonthTemperatures);

    }

    @Test void test_Tally() {
        Library sut = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Tony");
        votes.add("Mike");
        votes.add("Mike");
        votes.add("Tony");
        votes.add("Shane");
        votes.add("Mike");
        votes.add("Kevin");
        votes.add("Josh");


        String winner = sut.tally(votes);
        System.out.println(winner + " received the most votes!");
    }

}


