package com.itformacion.mybatis101;

public class Discount {
	public String discount_code;
	public double rate;

	@Override
	public String toString() {
		return "Discount [discountCode=" + discount_code + ", rate=" + rate + "]";
	}
}
