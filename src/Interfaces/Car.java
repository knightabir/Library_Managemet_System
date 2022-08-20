package Interfaces;

public class Car implements Break,Media,Engine{
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I Start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I Stop like a normal car");

    }
}
