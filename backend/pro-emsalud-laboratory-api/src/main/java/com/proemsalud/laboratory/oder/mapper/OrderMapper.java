package com.proemsalud.laboratory.oder.mapper;

import org.springframework.stereotype.Component;

import com.proemsalud.laboratory.doctor.domain.Doctor;
import com.proemsalud.laboratory.oder.domain.Order;
import com.proemsalud.laboratory.oder.dto.create.CreateOrderRequest;
import com.proemsalud.laboratory.oder.dto.response.OrderResponse;
import com.proemsalud.laboratory.patient.domain.Patient;

@Component
public class OrderMapper {
	
	public Order toEntity(CreateOrderRequest request, Doctor doctor, Patient patient) {
		return Order.builder()
			.doctor(doctor)
			.patient(patient)
			.build();
	}

	public OrderResponse toResponse(Order order) {
		return OrderResponse.builder()
			.id(order.getId())
			.status(order.getStatus())
			.patientId(order.getPatient().getId())
			.doctorId(order.getDoctor().getId())
			.doctorName(order.getDoctor().getFirstName())
			.doctorFullName(order.getDoctor().getFullName())
			.doctorTitle(order.getDoctor().getTitle())
			.createdAt(order.getCreatedAt())
			.updatedAt(order.getUpdatedAt())
			.build();
	}
	
	
//	private Double totalOrder(Order order) {
//		
//		Double total = order.getResults().stream()
//				.map(price -> price.get)
//	}
	
}
