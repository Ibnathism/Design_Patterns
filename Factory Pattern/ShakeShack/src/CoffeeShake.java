public class CoffeeShake extends Shake{
    private String additionalIng1;
    private String additionalIng2;
    private int basePrice;

    public CoffeeShake(String baseIng1, String baseIng2){
        super(baseIng1, baseIng2);
    }

    public CoffeeShake setAdditionalIng1(String additionalIng1) {
        this.additionalIng1 = additionalIng1;
        return this;
    }

    public CoffeeShake setAdditionalIng2(String additionalIng2) {
        this.additionalIng2 = additionalIng2;
        return this;
    }

    public CoffeeShake setBasePrice(int basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getAdditionalIng1() {
        return additionalIng1;
    }

    public String getAdditionalIng2() {
        return additionalIng2;
    }

    @Override
    public String toString() {
        return "CoffeeShake{" +
                "additionalIng1='" + additionalIng1 + '\'' +
                ", additionalIng2='" + additionalIng2 + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
