package javaDSA;

public class BuyAndSellStock {
	
	public static int sellingProfit(int prices[]) {
		int minPrize = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i=0; i<prices.length; i++) {
			if(minPrize > prices[i]) {
				minPrize = prices[i];
			}
			else {
				int profit = prices[i] - minPrize;
				if(profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		
		return maxProfit;
	}

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.println(sellingProfit(prices));
	}

}
