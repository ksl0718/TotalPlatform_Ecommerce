package com.example.demo.Entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;	
	
	private String id;
	
	private String pw;
	
	private String email;
	
	private String name;
	
	private String tell;
	
	private String address;
	
	private String addressDetail;
	
	private String gender;
	
	private LocalDateTime createDate;
	
	private String signoutYn;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	private List<Payment> paymentList;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Coupon> couponList;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	private List<Review> reviewList;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<Cart> cartList;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
	private List<CsQuestion> csQuestionList;
	
	
}
