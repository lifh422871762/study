package com.design.pattern.strategy;

/**
 * Title: ZsComparator
 * Description: 策略实现
 * @author lifh
 * @date 2021/9/14 22:13
 */
public class HeightComparator implements Comparator {

    @Override
    public int compare(People people) {
        if(people.getHeight() > 10 && people.getHeight()<20){
            return 1;
        } else if(people.getHeight() > 20 && people.getHeight()<40){
            return -1;
        } else if(people.getHeight() > 40){
            return 0;
        } else {
            return 0;
        }
    }

}
