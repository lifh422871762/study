package com.design.pattern.strategy;

/**
 * Title: ZsComparator
 * Description: 策略实现
 * @author lifh
 * @date 2021/9/14 22:13
 */
public class PriceComparator implements Comparator {

    @Override
    public int compare(People people) {
        if(people.getPrice() > 0 && people.getPrice()<200000){
            return 1;
        } else if(people.getPrice() > 200000 && people.getPrice()<500000){
            return -1;
        } else if(people.getPrice() > 500000){
            return 0;
        } else {
            return 0;
        }
    }

}
