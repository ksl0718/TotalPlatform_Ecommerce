package com.example.demo.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
	private final ProductRepository pr;
	
	public List<Product> getListProduct(List<String>productIdList){
		return this.pr.findByProductIdIn(productIdList);
	}

	public Product getProduct(Integer productId) throws NotFoundException{
		Optional<Product> p1 = this.pr.findById(productId);
		if(p1.isPresent()) {
			return p1.get();
		} else {
			throw new NotFoundException("데이터를 찾을 수 없습니다.");
		}
	}

	
	
	
}
