package com.example.demo.Product;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Cart.CartService;
import com.example.demo.Entity.Cart;
import com.example.demo.Entity.Product;
import com.example.demo.Product.ProductService;
import com.example.demo.Entity.User;
import com.example.demo.User.UserService;

import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ProductController {
	
	private final CartService carts;
	private final UserService us;
	private final ProductService ps;
	
	
//	---------------------------------------------장바구니----------------------------------------------------------------------------------------------
	@GetMapping("/product/{productId}/addcart")
	public String addcart(@PathVariable(value = "productId")Integer productId, Model model, Principal principal) throws Exception {
		User u = this.us.getUser(principal.getName());
		Product p = this.ps.getProduct(productId);
		
		try {
			Cart ct = this.carts.getCart(u.getUserId(), productId);
			if(!u.getCartList().contains(ct)) {
				this.carts.createCart(u, p);
			}
		} catch (Exception e) {
			this.carts.createCart(u, p);
		}
		model.addAttribute("user", u);
		return "Cart";
	}
	
	
	

}
