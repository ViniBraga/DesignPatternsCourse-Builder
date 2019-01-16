
public class BillOfSaleTest {

	public static void main(String[] args) {

		BillOfSaleBuilder bsBuilder = new BillOfSaleBuilder();
		bsBuilder.toCompany("Google")
			.includeCnpj("11.123.456/0001-01")
			.includeItem(new BillItem("Item 1", 200.0))
			.includeItem(new BillItem("Item 2", 300.0))
			.includeItem(new BillItem("Item 3", 400.0))
			.includePs("Any ps")
			.inCurrentDate();
		
		BillOfSale bs = bsBuilder.build();
		System.out.println(bs.getGrossValue());
		
	}

}
