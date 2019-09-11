package com.biz.pay;

import com.biz.pay.service.PayServiceV5;

/*
화폐 권종이 불규칙적인 경우
 */
public class Payment {

	public static void main(String[] args) {
		int pay=511010;
		PayServiceV5 ps=new PayServiceV5();
		
		ps.forPay(pay);
		
	}

}
