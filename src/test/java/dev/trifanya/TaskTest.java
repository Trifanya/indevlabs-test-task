package dev.trifanya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void findMissingMember_whenSumsAreNotEqualAscOrder() {
        int[] testSequence = new int[]{10, 11, 12, 13, 15, 16, 17, 18};
        
        int missingValue = Task.findMissingMember(testSequence);
        
        Assertions.assertEquals(14, missingValue);
    }

    @Test
    public void findMissingMember_whenSumsAreNotEqualDescOrder() {
        int[] testSequence = new int[]{111, 110, 109, 108, 106, 105, 104};
        
        int missingValue = Task.findMissingMember(testSequence);
        
        Assertions.assertEquals(107, missingValue);
    }

    @Test
    public void findMissingMember_whenSumsAreNotEqualRandomOrder() {
        int[] testSequence = new int[]{33, 28, 31, 27, 29, 32};
        
        int missingValue = Task.findMissingMember(testSequence);
        
        Assertions.assertEquals(30, missingValue);

    }

    @Test
    public void findMissingNumber_whenSumsAreEqualAndRangeStartsWithZero() {
        int[] testSequence = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        
        int missingValue = Task.findMissingMember(testSequence);
        
        Assertions.assertEquals(8, missingValue);
    }

    @Test
    public void findMissingNumber_whenSumsAreEqualAndRangeNotStartsWithZero() {
        int[] testSequence = new int[]{2, 3, 4, 5, 6, 7, 8};
        
        int missingValue = Task.findMissingMember(testSequence);
        
        Assertions.assertEquals(1, missingValue);
    }

}
