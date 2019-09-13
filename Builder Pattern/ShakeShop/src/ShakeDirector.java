public class ShakeDirector {
    private boolean addCookie;
    private boolean addCandy;
    private boolean isLactoseFree;
    private int myShakePrice;
    private int myShakeBasePrice;

    public ShakeDirector(boolean addCookie, boolean addCandy, boolean isLactoseFree) {
        this.addCookie = addCookie;
        this.addCandy = addCandy;
        this.isLactoseFree = isLactoseFree;
        myShakePrice = 0;
        myShakeBasePrice = 0;
    }

    public Shake produceShake(String name){
        ShakeBuilder shakeBuilder = new ShakeBuilder();
        shakeBuilder.addBaseIngredient(ShakeIngredient.MILK);
        if (name.equalsIgnoreCase(String.valueOf(ShakeName.ZERO_SHAKE))){
            shakeBuilder.addBaseIngredient(ShakeIngredient.SWEETENER).addAdditionalIngredient(ShakeIngredient.VANILLA_FLAVORING).addAdditionalIngredient(ShakeIngredient.SUGAR_FREE_JELLO);
            myShakeBasePrice = ShakeName.ZERO_SHAKE.getPrice();
            myShakePrice = myShakePrice + ShakeName.ZERO_SHAKE.getPrice();
        } else {
            shakeBuilder.addBaseIngredient(ShakeIngredient.SUGAR);
            if (name.equalsIgnoreCase(String.valueOf(ShakeName.CHOCOLATE_SHAKE))){
                shakeBuilder.addAdditionalIngredient(ShakeIngredient.CHOCOLATE_SYRUP).addAdditionalIngredient(ShakeIngredient.CHOCOLATE_ICECREAM);
                myShakeBasePrice = ShakeName.CHOCOLATE_SHAKE.getPrice();
                myShakePrice = myShakePrice + ShakeName.CHOCOLATE_SHAKE.getPrice();
            } else if (name.equalsIgnoreCase(String.valueOf(ShakeName.COFFEE_SHAKE))){
                shakeBuilder.addAdditionalIngredient(ShakeIngredient.COFFEE).addAdditionalIngredient(ShakeIngredient.JELLO);
                myShakeBasePrice = ShakeName.COFFEE_SHAKE.getPrice();
                myShakePrice = myShakePrice + ShakeName.COFFEE_SHAKE.getPrice();
            } else if (name.equalsIgnoreCase(String.valueOf(ShakeName.STRAWBERRY_SHAKE))){
                shakeBuilder.addAdditionalIngredient(ShakeIngredient.STRAWBERRY_SYRUP).addAdditionalIngredient(ShakeIngredient.STRAWBERRY_ICECREAM);
                myShakeBasePrice = ShakeName.STRAWBERRY_SHAKE.getPrice();
                myShakePrice = myShakePrice + ShakeName.STRAWBERRY_SHAKE.getPrice();
            } else if (name.equalsIgnoreCase(String.valueOf(ShakeName.VANILLA_SHAKE))){
                shakeBuilder.addAdditionalIngredient(ShakeIngredient.VANILLA_FLAVORING).addAdditionalIngredient(ShakeIngredient.JELLO);
                myShakeBasePrice = ShakeName.VANILLA_SHAKE.getPrice();
                myShakePrice = myShakePrice + ShakeName.VANILLA_SHAKE.getPrice();
            } else {
                System.out.println("This is not available");
                return null;
            }
        }

        if (addCandy) {
            shakeBuilder.addTopping(ShakeIngredient.CANDY);
            myShakePrice = myShakePrice + ShakeIngredient.CANDY.getPrice();
        }
        if (addCookie) {
            shakeBuilder.addTopping(ShakeIngredient.COOKIE);
            myShakePrice = myShakePrice + ShakeIngredient.COOKIE.getPrice();
        }
        if (isLactoseFree) {
            shakeBuilder.makeLactoseFree();
            myShakePrice = myShakePrice + ShakeIngredient.ALMOND_MILK.getPrice();
        }

        return shakeBuilder.build();

    }


    public int getMyShakePrice() {
        return myShakePrice;
    }

    public int getMyShakeBasePrice() {
        return myShakeBasePrice;
    }
}
