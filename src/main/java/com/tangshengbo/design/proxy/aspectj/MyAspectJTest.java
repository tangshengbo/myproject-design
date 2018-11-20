package com.tangshengbo.design.proxy.aspectj;

/**
 * Created by Tangshengbo on 2018/11/20
 */
public class MyAspectJTest {

    public void sayHello(){
        System.out.println("hello world !");
    }
    public static void main(String args[]){
        MyAspectJTest myAspectJTest =new MyAspectJTest();
        myAspectJTest.sayHello();
    }
}
