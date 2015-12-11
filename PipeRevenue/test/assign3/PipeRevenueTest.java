package assign3;

import junit.framework.TestCase;
import org.junit.Test;
import assign3.PipeRevenue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PipeRevenueTest  extends TestCase
{

    private PipeRevenue _piperevenue;
    private List<Integer> prices =
            Arrays.asList(1, 2, 3, 4, 6, 7, 8, 8, 9, 10);
    private int splitSize;
    private int length;

    protected PipeRevenue createPipe()
    {
        return new PipeRevenue();
    }

    public void setUp()
    {
        _piperevenue = createPipe();
    }

    public void testCanary()
    {
        assert(true);
    }

    public void testFindMaxRevenueForPipeOfLengthOne()
    {
        length = 1;
        assertEquals(1, _piperevenue.findMaxRevenue(length, prices));
    }

    public void testFindMaxRevenueForPipeOfLengthTwo()
    {
        length = 2;
        assertEquals(2, _piperevenue.findMaxRevenue(length, prices));
    }

    public void testFindMaxRevenueForPipeOfLengthThree()
    {
        length = 3;
        assertEquals(3, _piperevenue.findMaxRevenue(length, prices));
    }

    public void testFindMaxRevenueForPipeOfLengthFive()
    {
        length = 5;
        assertEquals(6, _piperevenue.findMaxRevenue(length, prices));
    }

    public void testFindMaxRevenueForPipeOfLengthEight()
    {
        length = 8;
        assertEquals(9, _piperevenue.findMaxRevenue(length, prices));
    }

    public void testFindMaxRevenueForPipeOfLengthTen()
    {
        length = 10;
        assertEquals(12, _piperevenue.findMaxRevenue(length, prices));
    }
}
