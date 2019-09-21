package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="transaction_tbl")
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long is;
	private String name;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestinationCountry;
	private String AccountNumber;
	private double Amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		SourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		DestinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		DestinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return DestinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		DestinationCountry = destinationCountry;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	
	
}
