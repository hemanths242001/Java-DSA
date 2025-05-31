package javaDSA;

public class KadaneBuyAndSellStock {
	
	public static int maxProfitKadane(int[] prices) {
		//maxCur tracks the maximum profit ending at the current day
		//maxSoFar tracks the overall maximum profit found so far
	    int maxCur = 0, maxSoFar = 0;
	    for (int i = 1; i < prices.length; i++) {
	        maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
	        maxSoFar = Math.max(maxSoFar, maxCur);
	    }
	    return maxSoFar;
	}

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.println(maxProfitKadane(prices));

	}

}
