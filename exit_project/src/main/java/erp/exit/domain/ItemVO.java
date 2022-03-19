package erp.exit.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ItemVO {
	
	private long rn; //넘버링
	private long idx; //시퀀스 고유값
	private String inspectionItem; //검사항목 
	private String inspectionItemName; //검사항목명
	private String qua; //정성정량 
	private int sampleWater; //시료수 
	private int ac; //AC값
	private int re; //RE값
	private String usl; //USL
	private String sl; //SL
	private String lsl; //LSL
	private String ucl; //UCL
	private String cl; //CL
	private String lcl; //LCL
	private int unit; //단위
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date creationDate; //생성일자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date modifiedDate; //수정일자
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date delDate; //삭제일
	
	private char disposal; //폐기여부
	private String note; //비고
	
	
	// 날짜 포맷 적용
	private String df_creationDate;
	private String df_modifiedDate;
	private String df_delDate;

}
