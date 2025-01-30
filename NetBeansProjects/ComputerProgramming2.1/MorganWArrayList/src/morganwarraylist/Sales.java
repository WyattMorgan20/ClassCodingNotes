/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morganwarraylist;

/**
 *
 * @author s540549
 */
public class Sales 
{
	private String customerName;
	private int customerNo;
	private double balance;
	
	public Sales( String customerName, int customerNo, 
double balance)
	{
		this.customerName = customerName;
		this.customerNo = customerNo;
		this.balance = balance;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public int getCustomerNo() 
	{
		return customerNo;
	}

	public void setCustomerNo(int customerNo) 
	{
		this.customerNo = customerNo;
	}
}
