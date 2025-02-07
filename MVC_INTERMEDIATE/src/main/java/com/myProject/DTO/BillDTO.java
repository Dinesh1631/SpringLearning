package com.myProject.DTO;

public class BillDTO {
	private String Amount;
	private String currency;

	@Override
	public String toString() {
		return Amount+" "+currency;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}
}
