package org.example;

public class Lion extends CatFamily implements FlyAbility {

public void loudSay() {

}

public void superRun() {

}

public void beKing() {

}

    @Override
    public void say() {
        System.out.println("Лев громко рычит");
    }
    @Override
    public void hunt() {
        System.out.println("Лев охотится");
    }

    @Override
    public void fly() {
        System.out.println("Лев может летать");
    }
}
