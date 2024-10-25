package com.example.demo.Product;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Admin.Product.AdminProductRepository;
import com.example.demo.Entity.Product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
	
	private final AdminProductRepository apr;
	

	
//---------------------	id값으로 퀴즈 데이터 조회---------------------  
    public Product getProduct(Integer productId) { 
        Optional<Product> q = this.apr.findById(productId);
        return q.get();
//        if (q.isPresent()) {
//            return q.get();
//        } else {
//            throw new DataNotFoundException("quiz not found");
//            //만약 id값에 해당하는 질문 데이터가 없다면 DataNotFoundException 실행
//        }
    }

}
