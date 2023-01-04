package OopsProblem;

public class StockAccount {
        private String StockNames;
        private int NumOfShares;
        private double SharePrices;
        private double TotalValueOfShares;

        public String getStockNames() {
            return StockNames;
        }
        public void setStockNames(String StockNames) {
            this.StockNames = StockNames;
        }

        public int getNumOfShares() {
            return NumOfShares;
        }

        public void setNumOfShares(int NumOfShares) {
            this.NumOfShares = NumOfShares;
        }

        public double getSharePrices() {
            return SharePrices;
        }

        public void setSharePrices(double SharePrices) {
            this.SharePrices = SharePrices;
        }

        public double getTotalValueOfShares() {
            return TotalValueOfShares;
        }

        public void setTotalValueOfShares(double totalValueOfShares, double SharePrices) {
            this.TotalValueOfShares = totalValueOfShares;
        }
    }