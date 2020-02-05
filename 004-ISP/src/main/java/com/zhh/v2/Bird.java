package com.zhh.v2;

/**
 * @author zhh
 * @description 鸟
 * @date 2020-02-06 00:52
 */
public class Bird implements IEat, IFly, IMakeSound {

    public void eat() {
        System.out.println("鸟可以吃");
    }

    public void fly() {
        System.out.println("鸟可以飞");
    }

    public void makeSound() {
        System.out.println("鸟可以发出声音");
    }
}
