package com.qa.intro;

public class Trainee{
    private int passportNumber = 1355417;
    private double bankBalance = -537.86;
    private String memorableWord = "pareidolia";

    public int getPassportNumber(){
        return passportNumber;
    }

    public void setPassportNumber(int newPassportNumber){
        this.passportNumber = newPassportNumber;
    }

	@Override
	public String toString() {
		return "Trainee [passportNumber=" + passportNumber + ", bankBalance=" + bankBalance + ", memorableWord="
				+ memorableWord + "]";
	}

    //etc.
    
}
