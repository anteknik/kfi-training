package id.or.kfi.training.monolith;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		BigDecimal conversionMultiple=ExchangeUtil.cariFromto(from, to);
		BigDecimal totalCalculatedAmount = quantity.multiply(conversionMultiple);

		return new CurrencyConversionBean(101l, from, to, conversionMultiple, quantity, totalCalculatedAmount);
	}
	

}