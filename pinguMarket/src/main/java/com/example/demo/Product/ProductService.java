package com.example.demo.Product;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Review.CanNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
	
	private final ProductRepository pr;
	
	public Product getProduct(Integer productId) throws CanNotFoundException {
		Optional<Product> product = this.pr.findById(productId);
		if(product.isPresent()) {
			return product.get();
		}
		else {
			throw new CanNotFoundException("데이터를 찾을 수 없습니다.");
		}
	}
	
}
