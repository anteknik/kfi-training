package id.or.kfi.training.monolith;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangeUtil {
	
	public static List<ExchangeValue> exchangeValues = new ArrayList<>();

	
	public static BigDecimal cariFromto(String from,String to) {

		List<ExchangeValue> byId = generateExchange();
		for (ExchangeValue v : byId) {
			if (v.getFrom().equalsIgnoreCase(from) && v.getTo().equalsIgnoreCase(to)) {
				return v.getConversionMultiple();
			}
		}

		return null;
	}
	
	public static List<ExchangeValue> generateExchange() {
		exchangeValues.add(new ExchangeValue(101l, "USD", "MYR",new BigDecimal(4)));
		exchangeValues.add(new ExchangeValue(101l, "MYR", "USD",new BigDecimal(0.4)));
		exchangeValues.add(new ExchangeValue(101l, "USD", "IDR",new BigDecimal(14000)));
		exchangeValues.add(new ExchangeValue(101l, "IDR", "USD",new BigDecimal(0.0014)));
		exchangeValues.add(new ExchangeValue(101l, "IDR", "MYR",new BigDecimal(0.035)));
		exchangeValues.add(new ExchangeValue(101l, "MYR", "IDR",new BigDecimal(3500)));
		
		return exchangeValues;

	}

}
