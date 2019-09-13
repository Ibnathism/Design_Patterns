import java.util.ArrayList;

public class Shake {
    private ArrayList<ShakeIngredient> ingredients;
    private ShakeName name;


    public Shake(ShakeBuilder shakeBuilder) {
        ingredients = shakeBuilder.ingredients;
    }

    public ShakeName getName() {
        return name;
    }

    public void setName(ShakeName name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Ingredients :\n");

        for(ShakeIngredient s : ingredients)
        {
            result.append(s).append("      Extra Price Added").append(" : ").append(s.getPrice()).append(" Tk\n");
        }
        return result.toString();
    }
}
