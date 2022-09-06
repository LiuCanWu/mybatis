package com.unicom.test;

import com.unicom.service.impl.Agent;
import com.unicom.service.impl.SuperLiu;
import org.junit.Test;

public class Mytest {
    @Test
    public void testAgent() {
        //测试功能
//        SuperLiu liu = new SuperLiu();
//        liu.sing();
        Agent agent = new Agent();
        agent.sing();
    }
}