package com.example.demo.Product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Admin.Product.AdminProductService;
import com.example.demo.Entity.Product;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class ProductController {

private final ProductService ps;
private final AdminProductService aps;
	
	@GetMapping("/product/{productId}") //상품상세페이지
    public String ProductDetail(Model model, @PathVariable("productId") Integer productId) {
		//product_id로 조회해서 가져오기
		Product p = this.ps.getProduct(productId);
        model.addAttribute("p", p);
        return "/Product/ProductDetailPage"; 
    }
	
}
