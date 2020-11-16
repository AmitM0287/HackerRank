package numberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		double payment = 15362.1236;
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        
        Locale localeIndia = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(localeIndia);
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */        
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
	}

}
