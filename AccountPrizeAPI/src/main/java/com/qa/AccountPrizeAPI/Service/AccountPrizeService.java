package com.qa.AccountPrizeAPI.Service;

import org.springframework.stereotype.Service;

@Service
public interface AccountPrizeService {
	public String checkPrize(String accountNumber);
}
