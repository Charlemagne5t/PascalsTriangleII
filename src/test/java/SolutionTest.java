import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void getRowTest1(){
        List<Integer> result = new ArrayList<>(List.of(1,3,3,1));
        Assert.assertEquals(result, new Solution().getRow(3));
    }

    @Test
    public void getRowTest2(){
        List<Integer> result = new ArrayList<>(List.of(1));
        Assert.assertEquals(result, new Solution().getRow(0));
    }

    @Test
    public void getRowTest3(){
        List<Integer> result = new ArrayList<>(List.of(1,1));
        Assert.assertEquals(result, new Solution().getRow(1));
    }

}
