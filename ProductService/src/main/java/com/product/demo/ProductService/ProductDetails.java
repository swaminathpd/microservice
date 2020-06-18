package com.product.demo.ProductService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDetails {
	@RequestMapping("/products")
	public List<ProductVO> getProductDetails(){
		List<ProductVO> productVOs = new ArrayList<ProductVO>();
		ProductVO productVO1 = new ProductVO("P101","C201","RICE");
		ProductVO productVO2 = new ProductVO("P102","C202","COCOCOLA");
		ProductVO productVO3 = new ProductVO("P103","C203","BRUFIN");
		productVOs.add(productVO1);
		productVOs.add(productVO2);
		productVOs.add(productVO3);
		return productVOs;
	}

}
