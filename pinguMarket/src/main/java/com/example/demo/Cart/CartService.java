package com.example.demo.Cart;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Cart;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.User;
import com.example.demo.User.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CartService {
	
	private final CartRepository car;
	private final UserRepository ur;
	
	public void createCart(User user, Product product) {
		Cart cart = new Cart();
		cart.setUser(user);
		cart.setProduct(product);
		cart.setUpdateDate(LocalDateTime.now());
		this.car.save(cart);
	}
	
	public Cart getCart(Integer cartId) throws Exception {
		Optional<Cart> cart = this.car.findById(cartId);
		if(cart.isPresent()) {
			return cart.get();
		} else {
			throw new nosignException("존재하지 않는 카트입니다.");
		}
	}
	
	public Cart getCart(Integer ui, Integer pi) throws Exception {
		Optional<Cart> cart = this.car.findByUserProduct(ui, pi);
		if(cart.isPresent()) {
			return cart.get();
		} else {
			throw new nosignException("존재하지 않는 카트입니다.");
		}
	}
	
	public void delete(Cart cart) {
		this.car.delete(cart);
	}

}
