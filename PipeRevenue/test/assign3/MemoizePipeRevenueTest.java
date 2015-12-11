package assign3;

public class MemoizePipeRevenueTest extends PipeRevenueTest 
{
	@Override
	protected PipeRevenue createPipe() 
	{
		return new MemoizePipeRevenue();
	}
}
