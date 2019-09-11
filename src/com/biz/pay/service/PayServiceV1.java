package com.biz.pay.service;

import java.text.DecimalFormat;

/*
화폐 권종이 불규칙적인 경우
 */
public class PayServiceV1 {
	protected int pay=3548760;
	protected int[] money=new int[] {
			50000,
			10000,
			5000,
			1000,
			500,
			100,
			50,
			10
	};
	
	public void array(int nPay) {
		DecimalFormat payFrom=new DecimalFormat("###,###,###,###");
		String strPay=payFrom.format(nPay);
		
		DecimalFormat paperForm=new DecimalFormat("###,###");
		
		System.out.printf("급여수령액: %s\n",strPay);
		for(int i=0; i<money.length;i++) {
			int nCount=nPay/money[i];
			nPay=nPay-(nCount*money[i]);
			System.out.printf("%8s원권 %4d매\n",paperForm.format(money[i]),nCount);
		}
	}
}
