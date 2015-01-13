package killbill;

public class CurrencyConverterFactory {

	public static CurrencyConverter getCurrencyConverter(String ratesPath) {
		return CurrencyConverter.getInstance(ratesPath);
	}

}
