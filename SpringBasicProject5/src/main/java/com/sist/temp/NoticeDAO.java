package com.sist.temp;

import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO implements MyDAO{

	@Override
	public void select() {
		System.out.println("@@@@ select call() @@@@");
		
	}

	@Override
	public void insert() {
		System.out.println("@@@@ insert call() @@@@");
	}

}
