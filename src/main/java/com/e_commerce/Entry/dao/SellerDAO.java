package com.e_commerce.Entry.dao;

import org.springframework.http.ResponseEntity;

import com.e_commerce.Entry.dto.Seller;


public interface SellerDAO {

	ResponseEntity<?> getSeller(Integer s_id);
	ResponseEntity<?> addSeller(Seller seller);
	ResponseEntity<?> updateSeller(Integer s_id,Seller seller);
	ResponseEntity<?> deleteSeller(Integer s_id);
	ResponseEntity<?> sellerLogin(Seller seller);
	
}
