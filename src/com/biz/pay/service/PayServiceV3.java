package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV3 extends PayServiceV2 {

	@Override
	public void whilePay(int nPay) {
		// TODO Auto-generated method stub
		this.headerView(nPay);
		intSw=1;
		while(nPay>1) {
			int nCount=nPay/nMoney;
			nPay-=nCount*nMoney;
			
			DecimalFormat payFrom=new DecimalFormat("###,###,###,###");
			String strPay=payFrom.format(nPay);
			
			DecimalFormat paperForm=new DecimalFormat("###,###");
			
			System.out.printf("%8s원권 %4d매\n",paperForm.format(nMoney),nCount);
			if(intSw>=1) {
				nMoney/=5;
			} else {
				nMoney/=2;
			}
			intSw*=-1;
		}
	}
	
}
