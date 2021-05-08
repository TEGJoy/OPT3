public class KaartCollectie {

    private double total;
    private int count;

    public KaartCollectie () {

    }

    public void addItem(double price) {
        total += price;
        count++;
    }

    public double computeTotal () {
        return total;
    }
    public void clear () {
        total = 0.0;
        count = 0;
    }

    public int getCount () {
        return count;
    }

}
