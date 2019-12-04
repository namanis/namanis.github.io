package br.com.alpi.certificacao.ocp8.localization;

import java.util.Locale;
import java.util.ResourceBundle;
public class LocalizedHello {
public static void main(String args[]) {
	
Locale currentLocale = Locale.getDefault();
Locale.setDefault(Locale.ITALY);

ResourceBundle resBundle = ResourceBundle.getBundle("ResourceBundle", currentLocale);
System.out.printf(resBundle.getString("Greeting"));
}
}