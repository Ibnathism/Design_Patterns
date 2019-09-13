public enum ShakeName {

    CHOCOLATE_SHAKE(230), COFFEE_SHAKE(230), VANILLA_SHAKE(190), STRAWBERRY_SHAKE(200), ZERO_SHAKE(240);


    private int price;
    ShakeName(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

}
