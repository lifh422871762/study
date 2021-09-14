package com.design.pattern.singleton;

/**
 * @program: 单例模式
 * @description: 懒汉式
 * @author: lifh
 * @create: 2021-09-14 14:43
 **/

/**
 * 双重检出锁实现懒汉式单例模式--存在指令重排序问题，所以需要加上volatile
 */
public class User04 {

    private User04(){};

    private static volatile User04 instance;

    public static User04 getInstance() {
        if(null == instance) {
            synchronized (User04.class) {
                if(null == instance) {
                    instance = new User04();
                }
            }
        }
        return instance;
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[]args){

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(User04.getInstance().hashCode());
            }).start();
        }

    }

}
