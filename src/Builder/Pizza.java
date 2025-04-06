package Builder;

public class Pizza {

    private final String base;
    private final String sauce;
    private final String cheese;
    private final String toppings;
    private Pizza(Builder builder) {
        this.base = builder.base;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
    }


    public static class Builder{


        private String base;
        private String sauce;
        private String cheese;
        private String toppings;


        public Builder setBase(String base) {
            this.base = base;
            return  this;
        }
        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return  this;
        }

        public Builder setCheese(String cheese) {
            this.cheese = cheese;
            return  this;
        }

        public Builder setToppings(String toppings) {
            this.toppings = toppings;
            return  this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }


    public void showPizza() {
        System.out.println("Base: " + base);
        System.out.println("Sauce: " + sauce);
        System.out.println("Cheese: " + cheese);
        System.out.println("Toppings: " + toppings);
    }
}
