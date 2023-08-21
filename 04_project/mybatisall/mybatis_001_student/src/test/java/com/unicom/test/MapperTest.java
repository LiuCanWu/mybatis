package com.unicom.test;

import com.unicom.dataservice.mapper.TfStudentMapper;
import org.junit.Test;

/**
 * @Author：liuyang
 * @Date：2023-8-21
 */
public class MapperTest {

    private TfStudentMapper tfStudentMapper;


    @Test
    public void mapperTest() {
        String nameTmp = tfStudentMapper.selectNameById(10);
        System.out.println(nameTmp);
    }
}
