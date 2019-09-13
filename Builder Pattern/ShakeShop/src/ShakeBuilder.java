import java.util.ArrayList;

public class ShakeBuilder {
    ArrayList<ShakeIngredient> ingredients;

    public ShakeBuilder() {
        this.ingredients = new ArrayList<>();
    }

    public ShakeBuilder addBaseIngredient(ShakeIngredient baseIng){
        ingredients.add(baseIng);
        return this;
    }

    public ShakeBuilder addAdditionalIngredient(ShakeIngredient additionalIng){
        ingredients.add(additionalIng);
        return this;
    }

    public ShakeBuilder addTopping(ShakeIngredient topping){
        ingredients.add(topping);
        return this;
    }

    public ShakeBuilder makeLactoseFree(){
        ingredients.remove(ShakeIngredient.MILK);
        ingredients.add(ShakeIngredient.ALMOND_MILK);
        return this;
    }

    public Shake build(){
        return new Shake(this);
    }

}
