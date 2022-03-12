package erp.exit.domain;

import java.text.DecimalFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {
	
	// 검색기능 DTO 필드
	private String code;
	private String codeName;
	private String buyer;
	private String buyerName;
	private String purchasing;
	private String purchasingName;
	private String buyCompany;
	private String buyCompanyName;
	private String inspectperson;
	private String currentInventory;
	private String price;
	private char inspect;
	private char disuse;
	
	//검색필터
	private String type;
	private String keyword;
	
}
