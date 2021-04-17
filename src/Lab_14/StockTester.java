
public class StockTester {
    public static void main(String[] args) {
        Stock s = new Stock("A", "Apple");
        System.out.println("Symbol: " + s.getSymbol());
        System.out.println("Name: " + s.getName());
        s.setPreviousClosingPrice(4);
        s.setCurrentPrice(2);
        System.out.println("Previous closing price: " + s.getPreviousClosingPrice());
        System.out.println("Current price: " + s.getCurrentPrice());
        System.out.println("Percentage change: " + s.changePercent());
    }
}