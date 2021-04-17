public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String s, String n) {
        symbol = s;
        name = n;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double p) {
        previousClosingPrice = p;
    }

    public void setCurrentPrice(double c) {
        currentPrice = c;
    }

    public double changePercent() {
        double decrease = previousClosingPrice - currentPrice;
        double percent = decrease / previousClosingPrice * 100;
        percent = Math.abs(percent);
        return percent;
    }
}
