package erp.exit.domain;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class LotVO {

	 private long rn; //넘버링
	   private long idx; //시퀀스 고유값
	   private long lot_no; //LOT_NO
	   private int lot_size; //LOT_SIZE
	   private String code; //자재코드
	   private String codeName; //자재명
	   private String pass_or_fail; //합불여부
	   private String constructor; //생성자
	   
	   @DateTimeFormat(pattern = "yyyy-MM-dd")
	   private Data creationDate; //생성일자
	   
	   private String note; //비고
}
