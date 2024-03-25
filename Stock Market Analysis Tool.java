import java.util.Scanner;

public class StockMarketAnalysisTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter stock data
        System.out.println("Enter the stock data:");
        System.out.print("Enter the number of shares: ");
        int numberOfShares = scanner.nextInt();
        System.out.print("Enter the purchase price per share: ");
        double purchasePricePerShare = scanner.nextDouble();
        System.out.print("Enter the selling price per share: ");
        double sellingPricePerShare = scanner.nextDouble();
        
        // Calculate total purchase and selling prices
        double totalPurchasePrice = numberOfShares * purchasePricePerShare;
        double totalSellingPrice = numberOfShares * sellingPricePerShare;
        
        // Calculate profit or loss
        double profitOrLoss = totalSellingPrice - totalPurchasePrice;
        
        // Display the result
        if (profitOrLoss > 0) {
            System.out.println("You made a profit of $" + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("You incurred a loss of $" + (-profitOrLoss));
        } else {
            System.out.println("You broke even.");
        }
        
        scanner.close();
    }
}
