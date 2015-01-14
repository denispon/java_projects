package calculator;

import killbill.Record;

public class Calculator implements ICalculator {

	@Override
	public double calculate(Record record) {
		return record.getPriceForUnit() * record.getQuantity();
	}

}
