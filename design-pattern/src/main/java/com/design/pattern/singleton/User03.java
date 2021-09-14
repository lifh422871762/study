package com.design.pattern.singleton;

/**
 * @program: 单例模式
 * @description: 懒汉式
 * @author: lifh
 * @create: 2021-09-14 14:43
 **/

/**
 * 静态内部类的方式：JVM启动加载Class只会load一次，但是对于静态内部类只会在被访问时加载，所以可以保证实例的唯一，以及多线程的同步，并且保证懒加载
 */
public class User03 {

    private User03(){};

    public static User03 getInstance() {
        return MyHandel.instance;
    }

    static class MyHandel {
        private static User03 instance = new User03();
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[]args){

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(User03.getInstance().hashCode());
            }).start();
        }

    }

}
