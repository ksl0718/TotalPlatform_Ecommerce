package com.example.demo.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cs_question")
public class CsQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer csQuestionId;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "payment_id")
	private Payment payment;
	
	private String title;
	
	private String contents;
	
	private LocalDateTime updateDate;

}
