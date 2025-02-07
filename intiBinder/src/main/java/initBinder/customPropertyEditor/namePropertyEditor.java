package initBinder.customPropertyEditor;

import java.beans.PropertyEditorSupport;

public class namePropertyEditor extends PropertyEditorSupport {
	 public void setAsText(String text) throws java.lang.IllegalArgumentException {
	        if (text.length()!=0) {
	            setValue(text.toUpperCase());
	            return;
	        }
	        throw new java.lang.IllegalArgumentException(text);
	    }
}
