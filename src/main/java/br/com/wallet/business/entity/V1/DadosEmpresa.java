package br.com.wallet.business.entity.V1;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DadosEmpresa {

	private Long id;
	private MetaData metaData;
	private TimeSeriesOneMinute timeSeriesOneMinutes;



}
