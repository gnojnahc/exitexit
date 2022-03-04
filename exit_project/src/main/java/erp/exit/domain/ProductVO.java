package erp.exit.domain;

import lombok.Data;

@Data
public class ProductVO {
	
	private String code;
	private String codeName;
	private String buyer;
	private String buyerName;
	private String purchasing;
	private String purchasingName;
	private String buyCompany;
	private String buyCompanyName;
	private String inspectperson;
	private int currentInventory;
	private long price;
	private char inspect;
	private char disuse;

}
