 
package com.beone.e4.translation.parts;

import javax.inject.Inject;

import org.eclipse.e4.tools.services.Translation;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.beone.e4.translation.LocalizationHelper;
import com.beone.e4.translation.plugin.PluginMessages;

public class PluginExample {

	private Label myFirstLabel;
	private Label mySecondLabel;
	private Label myThirdLabel;

	@Inject
	public PluginExample(Composite parent) {
		myFirstLabel = new Label(parent, SWT.NONE);
		mySecondLabel = new Label(parent, SWT.NONE);
		myThirdLabel = new Label(parent, SWT.NONE);
	}
	
	@Inject
	public void translate(@Translation PluginMessages messages) {
		LocalizationHelper.updateLabelText(myFirstLabel, messages.first_label_message);
		LocalizationHelper.updateLabelText(mySecondLabel, messages.second_label_message);
		LocalizationHelper.updateLabelText(myThirdLabel, messages.third_label_message);
	}
	
	@Focus
	public void onFocus() {
		if (myFirstLabel != null) {
			myFirstLabel.setFocus();
		}
	}

}