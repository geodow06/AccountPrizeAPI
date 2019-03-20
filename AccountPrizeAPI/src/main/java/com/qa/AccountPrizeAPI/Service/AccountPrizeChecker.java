package com.qa.AccountPrizeAPI.Service;

import org.springframework.stereotype.Service;

@Service
public class AccountPrizeChecker implements AccountPrizeService {
	@Override
	public String checkPrize(String accountNumber) {

		String prize = "";
		int noOfDigits = accountNumber.length() - 1;
		switch (accountNumber.substring(0, 1)) {
		case "a":
			prize = "you have not won a pirze, soz";
			break;
		case "b":
			switch (noOfDigits) {
			case 6:
				prize = "You have won 50 dollars";
				break;
			case 8:
				prize = "You have won 500 dollars";
				break;
			case 10:
				prize = "You have won 5000 dollars";
				break;
			}
			break;
		case "c":
			switch (noOfDigits) {
			case 6:
				prize = "You have won 100 dollars";
				break;
			case 8:
				prize = "You have won 700 dollars";
				break;
			case 10:
				prize = "You have won 10000 dollars";
				break;
			}
			break;
		}
		return prize;

	}
}
