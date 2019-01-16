import java.util.Calendar;
import java.util.List;

public class BillOfSale {

	private String  businessName;
	private String  cnpj;
	private Calendar issueDate;
	private double grossValue;
	private double taxes;
	public List<BillItem> items;
	public String ps;
	
	public BillOfSale(String businessName, String cnpj, Calendar issueDate, double grossValue, double taxes,
			List<BillItem> items, String ps) {
		super();
		this.businessName = businessName;
		this.cnpj = cnpj;
		this.issueDate = issueDate;
		this.grossValue = grossValue;
		this.taxes = taxes;
		this.items = items;
		this.ps = ps;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Calendar issueDate) {
		this.issueDate = issueDate;
	}

	public double getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(double grossValue) {
		this.grossValue = grossValue;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public List<BillItem> getItems() {
		return items;
	}

	public void setItems(List<BillItem> items) {
		this.items = items;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}
	
}
