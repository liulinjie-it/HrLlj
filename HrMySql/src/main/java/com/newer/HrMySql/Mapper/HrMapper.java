package com.newer.HrMySql.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.newer.HrMySql.HR;

public interface HrMapper {
    
	@Select("select * from hrmysql")
	List<HR> findAll();
}
