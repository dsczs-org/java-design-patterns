package com.zhh.v1;

/**
 * @author zhh
 * @description 小米电子产品工厂类
 * @date 2020-02-11 01:01
 */
public class MiElectronicProductFactory implements ElectronicProductFactory {

    @Override
    public Phone getPhone() {
        return new MiPhone();
    }

    @Override
    public Computer getComputer() {
        return new MiComputer();
    }
}
