package Builder;

public class Driver {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder().
                setBase("Thin Crust").
                setSauce("Tomato").
                setCheese("Mozzarella").
                setToppings("Corn, Jalapeno").build();
        pizza.showPizza();
    }
}
