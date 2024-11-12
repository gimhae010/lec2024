package com.gimhae.sts10.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gimhae.sts10.model.entity.Dept02;

@Service
public class DeptService {
	@Autowired
	DeptRepo deptRepo;

	public List<Dept02> getList(){
		Iterable<Dept02> iteObj = deptRepo.findAll();
		List<Dept02> list=new ArrayList<>();
		
//		Iterator<Dept02> ite = iteObj.iterator();
//		while(ite.hasNext()) {
//			Dept02 bean = ite.next();
//			if(bean==null)break;
//			list.add(bean);
//		}
		
//		Consumer consum=new Consumer<Dept02>() {
//			@Override
//			public void accept(Dept02 ele) {
//				list.add(ele);
//			}
//		};
//		iteObj.forEach(consum);
		
		
//		Consumer<Dept02> consum=ele->list.add(ele);
//		iteObj.forEach(consum);

//		Consumer<Dept02> consum=ele->{list.add(ele);};
		
		iteObj.forEach(ele->list.add(ele));
		return list;
	}
}












