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
        System.out.println("欢迎下次继续合作！");
        System.out.println("有意向我们随时联系。"); // at hot-fix
        System.out.println("master test");
        System.out.println("hot-fix test");

        System.out.println("push test");
        System.out.println("pull test");
    }
}
