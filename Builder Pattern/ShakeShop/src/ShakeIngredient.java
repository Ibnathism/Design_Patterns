public enum ShakeIngredient {

    MILK(0), ALMOND_MILK(60), SUGAR(0), SWEETENER(0), CHOCOLATE_SYRUP(0),
    CHOCOLATE_ICECREAM(0), COFFEE(0), JELLO(0), STRAWBERRY_SYRUP(0), STRAWBERRY_ICECREAM(0),
    VANILLA_FLAVORING(0), SUGAR_FREE_JELLO(0), CANDY(50), COOKIE(40);

    private int price;
    ShakeIngredient(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }


}
