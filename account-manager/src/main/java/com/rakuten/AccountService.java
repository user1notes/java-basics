package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	AccountRepository repository;

	List<Account> accounts = new ArrayList<>();
	public void save(Account account) {
		repository.save(account);
		System.out.println(accounts);
	}
//	public List<Account> getAccount() {
//		// TODO Auto-generated method stub
//		return repository.findAll();
//	}
	
	

}
