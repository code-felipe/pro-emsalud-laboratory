package com.proemsalud.laboratory.result.dto.response;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestResultResponse {
	
	private Long id;
	
	private String result;
	
	private String testName;
	
	private BigDecimal unitPrice;
	
	private Instant createdAt;
	
	private Instant updatedAt;
	
	private Long testId;
	    
}
