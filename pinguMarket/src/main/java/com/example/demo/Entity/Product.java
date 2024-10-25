package com.example.demo.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.ColumnDefault;

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
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	
	private String name;
	
	private String category;
	
	private Integer price;
	
	private Integer amount; //수량
	
	
	private String cancelYn;
	
	private LocalDateTime updateDate;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
	private List<ProductImg> productImgList;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
	private List<Review> reviewList;
}
