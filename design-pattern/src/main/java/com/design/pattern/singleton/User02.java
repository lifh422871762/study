package com.design.pattern.singleton;

/**
 * @program: 单例模式
 * @description: 饿汉式
 * @author: lifh
 * @create: 2021-09-14 14:43
 **/

/**
 * 静态代码块的方式：JVM启动加载静态资源，所以可以保证实例的唯一，以及多线程的同步
 */
public class User02 {

    private User02(){};

    private static User02 instance;

    static {
        instance = new User02();
    }

    public static User02 getInstance() {
        return instance;
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[]args){

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(User02.getInstance().hashCode());
            }).start();
        }

    }

}
