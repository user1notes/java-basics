package com.rakuten;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService service;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void save(@RequestBody Account account) {
		System.out.println(account.getOwner());
		System.out.println(account.getAddress());
		System.out.println(account.getBalance());
		System.out.println(account.getMobileNumber());
		System.out.println(account.getDate());
		System.out.println(account.getStatus());
		System.out.println(account.getType());
		service.save(account);
	}

//	@GetMapping
//	List<Account> getAccounts(){
//		return service.getAccount();
//	}
//	
}
