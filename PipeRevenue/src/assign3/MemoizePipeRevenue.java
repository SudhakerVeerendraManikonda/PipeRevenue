package assign3;

import java.util.*;
import assign3.PipeRevenue;

public class MemoizePipeRevenue extends PipeRevenue
{
    private Map<Integer, Integer> lengthAndPrices = 
        new HashMap<Integer, Integer>();

    public int findMaxRevenue(int length, List<Integer> prices)
    {
        if (!lengthAndPrices.containsKey(length))
        {
            int price = super.findMaxRevenue(length, prices);
            lengthAndPrices.put(length, price);
        }
        return lengthAndPrices.get(length);
    }
}
