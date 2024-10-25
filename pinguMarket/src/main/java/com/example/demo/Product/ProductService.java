package com.example.demo.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Product;

import javassist.NotFoundException;
import com.example.demo.Admin.Product.AdminProductRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductService {
	private final ProductRepository pr;
    private final AdminProductRepository apr;
	
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
  
	

	
//---------------------	id값으로 퀴즈 데이터 조회---------------------  
//    public Product getProduct(Integer productId) { 
//        Optional<Product> q = this.apr.findById(productId);
//        return q.get();
//        if (q.isPresent()) {
//            return q.get();
//        } else {
//            throw new DataNotFoundException("quiz not found");
//            //만약 id값에 해당하는 질문 데이터가 없다면 DataNotFoundException 실행
//        }
//    }

	
	
}
