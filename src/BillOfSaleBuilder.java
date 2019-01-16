import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BillOfSaleBuilder {

	private String businessName;
	private String cnpj;
	private List<BillItem> allItems = new ArrayList<>();
	private double grossValue;
	private double tax;
	private String ps;
	private Calendar date;
	
	public BillOfSaleBuilder toCompany(String businessName) {
		this.businessName = businessName;
		return this;
	}

	public BillOfSaleBuilder includeCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public BillOfSaleBuilder includeItem(BillItem item) {
		allItems.add(item);
		grossValue += item.getValue();
		tax += item.getValue() * 0.05;
		return this;
	}
	
	public BillOfSaleBuilder includePs(String ps) {
		this.ps = ps;
		return this;
	}
	
	public BillOfSaleBuilder inCurrentDate() {
		this.date = Calendar.getInstance();
		return this;
	}
	
	public BillOfSale build() {
		return new BillOfSale(businessName, cnpj, date, grossValue, tax, allItems, ps);
	}
	
}
