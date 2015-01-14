package billParser;

public interface IBillParser {
	abstract public void parseBill(String rawBillPath, Object parseredBill);
}
