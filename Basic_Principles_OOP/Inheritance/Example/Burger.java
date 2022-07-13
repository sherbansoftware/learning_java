package Basic_Principles_OOP.Inheritance.Example;

public class Burger {
}

class HealthyBurger extends Burger {
}

class BurgerFactory {
    public Burger createBurgher() {
        return new Burger();
    }
}

class HealthyBurgherFactory extends BurgerFactory {

//    @Override
//    public Burger createBurgher() {
//        return new Burger();
//    }

    @Override
    public HealthyBurger createBurgher() {
        return new HealthyBurger();
    }
}