package com.digit.javaTraining.LibraryManagemet.model;

public class PurchaseHistory {

	private int pid;
	private int book_id;
	private String bname;
	private int uid;
	private float amount;
	private Long invoice_no;
	
	public PurchaseHistory() {
		
	}

	public PurchaseHistory(int pid, int book_id, String bname, int uid, float amount, Long invoice_no) {
		super();
		this.pid = pid;
		this.book_id = book_id;
		this.bname = bname;
		this.uid = uid;
		this.amount = amount;
		this.invoice_no = invoice_no;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Long getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(Long invoice_no) {
		this.invoice_no = invoice_no;
	}
}
