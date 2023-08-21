package com.unicom.dataservice.mapper;

import com.unicom.dataservice.domain.TfStudent;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author：liuyang
 * @Date：2023-8-21
 */
@Mapper
public interface TfStudentMapper {

    int insertStudentInfo(TfStudent tfStudent);

    String selectNameById(int id);
}
