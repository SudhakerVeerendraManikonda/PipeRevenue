package assign3;

import java.util.List;

public class PipeRevenue
{
    public int findMaxRevenue(int length, List<Integer> prices)
    {
        int maxRevenue = prices.get(length - 1);
        for (int index = 1; index <= length - 1; index++)
            maxRevenue = Math.max(maxRevenue, findMaxRevenue(index, prices) 
                       + findMaxRevenue(length - index, prices));

        return maxRevenue;
    }
}

