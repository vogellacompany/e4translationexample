package org.fipro.e4.translation.named;

import java.text.MessageFormat;

import javax.annotation.PostConstruct;

public class NamedMessages {

	public String first_label_message;
	public String second_label_message;
	public String third_label_message;
	
	@PostConstruct
	public void format() {
		first_label_message = MessageFormat.format(first_label_message, "ResourceBundles"); //$NON-NLS-1$
	}
	
}
