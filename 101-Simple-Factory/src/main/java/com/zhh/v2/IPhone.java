package com.zhh.v2;

/**
 * @author zhh
 * @description 苹果手机
 * @date 2020-02-10 11:07
 */
public class IPhone implements Phone {

    @Override
    public void call() {
        System.out.println("使用苹果手机拨打电话");
    }
}
