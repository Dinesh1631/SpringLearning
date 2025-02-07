package com.myProject.Formatter;

import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.myProject.DTO.BillDTO;

public class currencyFormatter implements Formatter<BillDTO> {

	@Override
	public String print(BillDTO object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public BillDTO parse(String text, Locale locale) throws ParseException {
		System.out.println("Inside Bull Dto formatter");
		String[] bill = text.split(" ");

		String amount = bill[0];
		String currencyString = bill[1];
		
		locale = Locale.getDefault();
		Currency currency = Currency.getInstance(currencyString);
		String currencySymbol = currency.getSymbol(locale);

		BillDTO billdto = new BillDTO();
		billdto.setAmount(amount);
		billdto.setCurrency(currencySymbol);

		return billdto;
	}

}
