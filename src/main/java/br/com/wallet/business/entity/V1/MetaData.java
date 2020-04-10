package br.com.wallet.business.entity.V1;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MetaData {

	private String information;
	private String symbol;
	private LocalDateTime lastRefreshed;
	private String interval;
	private String outputSize;
	private String timeZone;

}
