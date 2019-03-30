package exc67;

import java.util.*;

class invoice{
	Scanner read = new Scanner(System.in);

	String shippingAd,billingAd;
	ArrayList<String> items = new ArrayList<>();
	ArrayList<Integer> quantity = new ArrayList<>();
	ArrayList<Integer> payments = new ArrayList<>();
	ArrayList<Integer> paymentsDue = new ArrayList<>();

	public invoice(){
		this.shippingAd="";
		this.billingAd="";
	}
	public void addItem(String itemName, int quantity){
		this.items.add(itemName);
		this.quantity.add(quantity);
	}
	public void setAddress(){
		System.out.println("Enter shipping address:");
		this.shippingAd=read.nextLine();
		System.out.println("Enter billing address:");
		this.billingAd=read.nextLine();
	}
	public void addPayment(){
		System.out.println("Enter payment ammount:");
		this.payments.add(read.nextInt());
	}
	public void addDue(){
		System.out.println("Enter payment due ammount:");
		this.paymentsDue.add(read.nextInt());
	}
	public void displayInvoice(){
		System.out.println("\nShipping Address: " + this.shippingAd);
		System.out.println("Billing Address: " + this.billingAd);
		System.out.println("Items  -  Quantity");
		for (int i=0;i<items.size();i++){
			System.out.println(items.get(i) + " - " + quantity.get(i));
		}
		System.out.println("Payments: " + this.payments);
		System.out.println("Payments Due: " + this.paymentsDue + "\n");	
	}
}

public class sixAndSeven{
	public static void main(String[] args){
		invoice pharmacy = new invoice();
		invoice farmer = new invoice();
		pharmacy.setAddress();
		pharmacy.addDue();
		pharmacy.addItem("not drugs:tm:", 500);
		pharmacy.displayInvoice();
		farmer.addPayment();
		farmer.addItem("Tractor", 20);
		farmer.addItem("Dirt", 2000000);
		farmer.displayInvoice();
		

	}
}