package mx.com.everis.tallerjava.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Sumas {
	@WebMethod
	public int getSuma(int a, int b){
		return a+b;
	}
	
	public int getSumaTresNumeros(int a, int b, int c) {
		return a+b+c;
	}
	
	public int getSumaArrayNum(int [] numEnteros) {
		int sum = 0;
		if (numEnteros != null && numEnteros.length > 0) {
			for (int i = 0; i < numEnteros.length; i++) {
				sum += numEnteros[i];
			}
		}
		return sum;
	}
}
