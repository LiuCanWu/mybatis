package com.unicom.service.impl;

import com.unicom.service.Service;

public class Agent implements Service {
    @Override
    public void sing() {
        System.out.println("我是职业经纪人！");
        System.out.println("预约时间");
        System.out.println("预约场地");
        SuperLiu liu = new SuperLiu();
        liu.sing();
        System.out.println("费用结算");
    }
}
