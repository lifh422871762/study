package com.design.pattern.singleton;

/**
 * @program: 单例模式
 * @description: 饿汉式
 * @author: lifh
 * @create: 2021-09-14 14:43
 **/

/**
 * 静态变量的方式：JVM加载每个class只会load一次，所以可以保证实例的唯一，以及多线程的同步
 */
public class User01 {

    private User01(){};

    private static final User01 instance = new User01();

    public static User01 getInstance() {
        return instance;
    }


    /**
     * 测试方法
     * @param args
     */
    public static void main(String[]args){

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(User01.getInstance().hashCode());
            }).start();
        }

    }

}
