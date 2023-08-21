package com.unicom.dataservice.service;

import com.unicom.dataservice.mapper.TfStudentMapper;


/**
 * @Author：liuyang
 * @Date：2023-8-21
 */
public class TfStudentService {

    private final TfStudentMapper tfStudentMapper;

    public TfStudentService(TfStudentMapper tfStudentMapper) {
        this.tfStudentMapper = tfStudentMapper;
    }


}
