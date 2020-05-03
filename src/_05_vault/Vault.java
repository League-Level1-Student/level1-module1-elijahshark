package _05_vault;

import java.util.Random;

public class Vault {

	Random ran = new Random();
	int secretcode;
	Vault(){	
		secretcode = ran.nextInt(100001);
	}
	boolean tryCode(int code) {

	if(code == secretcode) {
		return true;
	}
	else {
	return false;
	}
}
	}