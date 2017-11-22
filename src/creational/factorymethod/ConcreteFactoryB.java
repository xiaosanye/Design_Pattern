package creational.factorymethod;

public class ConcreteFactoryB implements IFactory{
    @Override
    public IProduct createProduct() {
        return new ConcreteProductB();
    }
}
