package org.fi.Transaction;

import java.sql.Date;

public class Transaction
{
	int txId;
	Date txDate;
	float txAmount;
	boolean txStatus;
	boolean txArrears;

	public Transaction(int txId,  float txAmount, boolean txStatus, boolean txArrears)
	{
		super();
		this.txId = txId;
		this.txDate = txDate;
		this.txAmount = txAmount;
		this.txStatus = txStatus;
		this.txArrears = txArrears;
	}

	public Date getTxDate()
	{
		return txDate;
	}

	public void setTxDate(Date txDate)
	{
		this.txDate = txDate;
	}

	public int getTxId()
	{
		return txId;
	}

	public void setTxId(int txId)
	{
		this.txId = txId;
	}

	public float getTxAmount()
	{
		return txAmount;
	}

	public void setTxAmount(float txAmount)
	{
		this.txAmount = txAmount;
	}

	public boolean isTxStatus()
	{
		return txStatus;
	}

	public void setTxStatus(boolean txStatus)
	{
		this.txStatus = txStatus;
	}

	public boolean isTxArrears()
	{
		return txArrears;
	}

	public void setTxArrears(boolean txArrears)
	{
		this.txArrears = txArrears;
	}

	@Override
	public String toString()
	{
		return "\nTransaction [txId=" + txId + ", txDate=" + txDate + ", txAmount=" + txAmount + ", txStatus=" + txStatus
				+ ", txArrears=" + txArrears + "]";
	}

}
