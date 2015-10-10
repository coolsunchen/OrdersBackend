package uy.com.orders.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="No stock available")
public class StockBusinessException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3456846920552166120L;



}
