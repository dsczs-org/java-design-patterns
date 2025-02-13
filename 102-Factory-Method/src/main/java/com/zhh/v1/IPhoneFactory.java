package com.zhh.v1;

/**
 * @author zhh
 * @description 苹果手机工厂类
 * @date 2020-02-10 15:12
 */
public class IPhoneFactory implements PhoneFactory {

    @Override
    public Phone getPhone() {
        return new IPhone();
    }
}
