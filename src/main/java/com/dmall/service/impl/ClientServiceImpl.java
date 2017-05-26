package com.dmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmall.beans.Client;
import com.dmall.dao.ClientDao;
import com.dmall.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao dao;
	
	@Override
	public Client checkUser(String username, String password) {
		return dao.checkUser(username, password);
	}

}
