package creational.abstractfactory;

public class ConcreteFactoryA1B2 implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ConcreteProductALEVEL1();
    }

    @Override
    public IProductB createProductB() {
        return new ConcreteProductBLEVEL2();
    }

}
