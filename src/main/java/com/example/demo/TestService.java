package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class TestService {
	
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void testTransaction1(){
		System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
		testTransaction2();
		
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void testTransaction2(){
		System.out.println(TransactionSynchronizationManager.getCurrentTransactionName());
		
	}

}
