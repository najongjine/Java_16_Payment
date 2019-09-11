package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV2 extends PayServiceV1{
	protected int nMoney=50000;
	protected int intSw=0;
	protected DecimalFormat payFrom=new DecimalFormat("###,###,###,###");
	public void whilePay(int nPay) {
		
		
		headerView(pay);
		while(true) {
			
			if(nPay<5) break;
			int nCount=nPay/nMoney;
			nPay-=nCount*nMoney;
			
			DecimalFormat payFrom=new DecimalFormat("###,###,###,###");
			String strPay=payFrom.format(nPay);
			
			DecimalFormat paperForm=new DecimalFormat("###,###");
			
			System.out.printf("%8s원권 %4d매\n",paperForm.format(nMoney),nCount);
			if(intSw==0) {
				nMoney/=5;
				intSw=1;
			} else {
				nMoney/=2;
				intSw=0;
			}
			
		}//end
		
	
	}

	protected void headerView(int pay) {
		
		String strPay=payFrom.format(pay);
		System.out.printf("급여수령액: %s\n",strPay);
		
	}

}
