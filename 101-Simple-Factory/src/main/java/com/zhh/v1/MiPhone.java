package com.zhh.v1;

/**
 * @author zhh
 * @description 小米手机
 * @date 2020-02-10 11:08
 */
public class MiPhone implements Phone {

    @Override
    public void call() {
        System.out.println("使用小米手机拨打电话");
    }
}
