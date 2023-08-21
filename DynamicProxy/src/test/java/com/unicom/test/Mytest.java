package com.unicom.test;

import com.unicom.service.impl.Agent;
import com.unicom.service.impl.SuperLiu;
import com.unicom.service.impl.Supersun;
import org.junit.Test;

public class Mytest {
    @Test
    public void testAgent() {
        //测试功能
//        SuperLiu liu = new SuperLiu();
//        liu.sing();
//        Agent agent = new Agent();
//        agent.sing();
        Agent liu = new Agent(new SuperLiu());
        liu.sing();
        Agent sun = new Agent(new Supersun());
        sun.sing();
     }
}