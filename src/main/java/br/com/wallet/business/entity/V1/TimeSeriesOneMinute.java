package br.com.wallet.business.entity.V1;


import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TimeSeriesOneMinute {


	private List<ListTimeSeries> listTimeSeries;


}
