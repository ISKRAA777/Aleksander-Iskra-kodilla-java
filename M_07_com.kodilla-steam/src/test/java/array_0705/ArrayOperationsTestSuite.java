package array_0705;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //given
        int [] numbers = new int []{4,14,24};
        //when
        double average = ArrayOperations.getAverage(numbers);
        //then
        Assert.assertEquals(14,average, 0.01);
    }

}