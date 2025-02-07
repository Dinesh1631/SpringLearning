package initBinder.customPropertyEditor;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class currencyPropertyEditor extends PropertyEditorSupport{
	 public void setAsText(String text) throws java.lang.IllegalArgumentException {
	        if (text!=null && text.trim().length()!=0) {
	        	text = text.toUpperCase();
	        	Currency currency = Currency.getInstance(text);
	            setValue(currency);
	            return;
	        }
	        throw new java.lang.IllegalArgumentException(text);
	    }
}
