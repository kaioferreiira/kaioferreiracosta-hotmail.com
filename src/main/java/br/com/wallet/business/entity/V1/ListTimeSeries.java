package br.com.wallet.business.entity.V1;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ListTimeSeries {

	private String open;
	private String high;
	private String low;
	private String close;
	private String volume;

}
