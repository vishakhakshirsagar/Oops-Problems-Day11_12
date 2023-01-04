package OopsProblem;
import java.util.ArrayList;
import java.util.Scanner;
public class StockPortFolio {
    // Array list of stock account
    ArrayList<StockPortFolio> list = new ArrayList<>();
    // object of scanner class for user input
    Scanner sc = new Scanner(System.in);
    private Object sharePrices;
    private String totalValueOfShares;
    private String stockNames;

    private void setStocks() {
        System.out.println("Enter the Number of Stock Accounts You Want To Have : ");
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            StockPortFolio stock = new StockPortFolio();
            setStockInfo(stock, i);
        }
    }
    private void setStockInfo(StockPortFolio stockAccount, int i) {
        System.out.println("Enter the Stock " + (i + 1) + " Information :");
        System.out.println("Enter the Stock Name :");
        stockAccount.setStockNames(sc.next());
        System.out.println("Enter the Number of Shares :");
        stockAccount.setNumOfShares(sc.nextInt());
        System.out.println("Enter the Price of each Share :");
        stockAccount.setSharePrices(sc.nextDouble());
        stockAccount.setNumOfShares (stockAccount.getNumOfShares(), stockAccount.getSharePrices());
        list.add(stockAccount);
    }
    private void setNumOfShares(Object numOfShares, Object sharePrices) {
    }
    private Object getNumOfShares() {
        return null;
    }
    private void setSharePrices(double nextDouble) {
    }
    private void setNumOfShares(int nextInt) {
    }
    private void setStockNames(String next) {
    }
    private void getStockInfo() {
        int i = 1;
        for (StockPortFolio stockAccount : list) {
            System.out.println("Stock " + i + " Information is :");
            System.out.println("Stock Name : " + stockAccount.getStockNames());
            System.out.println("Number of Shares : " + stockAccount.getNumOfShares());
            System.out.println("Price of each Shares : " + stockAccount.getSharePrices());
            System.out.println("Total Value of Shares : " + stockAccount.getTotalValueOfShares());
            i++;
        }
    }

    public static void main(String[] args) {
        StockPortFolio stockPortfolio = new StockPortFolio();
        stockPortfolio.setStocks();
        stockPortfolio.getStockInfo();
    }

    public Object getSharePrices() {
        return sharePrices;
    }

    public String getTotalValueOfShares() {
        return totalValueOfShares;
    }

    public String getStockNames() {
        return stockNames;
    }
}