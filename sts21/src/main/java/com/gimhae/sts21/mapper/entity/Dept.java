package com.gimhae.sts21.mapper.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
@Entity
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int deptno;
	String dname,loc;
}
