public class ShakeBuilder {

    private String baseIng1;
    private String baseIng2;
    private Shake myShake;
    private int myShakePrice;


    public ShakeBuilder setBaseIng1(String baseIng1) {
        this.baseIng1 = baseIng1;
        return this;
    }

    public ShakeBuilder setBaseIng2(String baseIng2) {
        this.baseIng2 = baseIng2;
        return this;
    }

    public Shake getMyShake() {
        return myShake;
    }

    public void produceShake(String name, boolean isLactoseFree, boolean withCandy, boolean withCookie) {
        if (name.equals("ChocolateShake")) {
            myShake = new ChocolateShake(baseIng1, baseIng2);
            ((ChocolateShake) myShake).setAdditionalIng1("Chocolate_Syrup").setAdditionalIng2("Chocolate_Icecream").setBasePrice(230);
            myShakePrice = ((ChocolateShake) myShake).getBasePrice();
        } else if (name.equals("CoffeeShake")) {
            myShake = new CoffeeShake(baseIng1, baseIng2);
            ((CoffeeShake) myShake).setAdditionalIng1("Coffee").setAdditionalIng2("Jello").setBasePrice(230);
            myShakePrice = ((CoffeeShake) myShake).getBasePrice();
        } else if (name.equals("StrawberryShake")) {
            myShake = new StrawberryShake(baseIng1, baseIng2);
            ((StrawberryShake) myShake).setAdditionalIng1("Strawberry_Syrup").setAdditionalIng2("Strawberry_Icecream").setBasePrice(200);
            myShakePrice = ((StrawberryShake) myShake).getBasePrice();
        } else if (name.equals("VanillaShake")) {
            myShake = new VanillaShake(baseIng1, baseIng2);
            ((VanillaShake) myShake).setAdditionalIng1("Vanilla_Flavoring").setAdditionalIng2("Jello").setBasePrice(190);
            myShakePrice = ((VanillaShake) myShake).getBasePrice();
        } else if (name.equals("ZeroShake")) {
            myShake = new ZeroShake(baseIng1, baseIng2);
            ((ZeroShake) myShake).setAdditionalIng1("Vanilla_Flavoring").setAdditionalIng2("Suger_Free_Jello").setBasePrice(240);
            myShakePrice = ((ZeroShake) myShake).getBasePrice();
        } else {
            return;
        }

        if (isLactoseFree) myShakePrice = myShakePrice + 60;
        if (withCandy) myShakePrice = myShakePrice + 50;
        if (withCookie) myShakePrice = myShakePrice + 40;
    }


}
