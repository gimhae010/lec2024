package com.gimhae.day53.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GuestDao {
	
	@Select("select * from guest")
	List<GuestVo> list();
}
