package assign3;

import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

public class TimingTest extends TestCase
{
    private List<Integer> prices =
            Arrays.asList(1, 2, 3, 4, 6, 7, 8, 8, 9, 10);
    private PipeRevenue _piperevenue = new PipeRevenue();
    private MemoizePipeRevenue _memoizepiperevenue = new MemoizePipeRevenue();

    public double computeTime(PipeRevenue _piperevenue)
    {
        double startTime = System.nanoTime();
        _piperevenue.findMaxRevenue(10, prices);
        return System.nanoTime() - startTime;
    }

    public void testCompareTimeBetweenAlgorithms()
    {
        assertTrue((computeTime(_piperevenue) / computeTime(_memoizepiperevenue)) 
            > 10);
    }
}