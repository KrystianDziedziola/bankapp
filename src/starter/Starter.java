package starter;

import presentationLayer.View;
import businessLogic.BankAccountManager;
import businessLogic.CustomerManager;
import dataLayer.Address;
import dataLayer.Customer;
import dataLayer.DaoInterface;
import dataLayer.DatabaseDao;
import dataLayer.XmlDao;

public class Starter {

	public static void main(String[] args) {
		new Starter();
	}
	
	public Starter() {
//		DaoInterface dao = new XmlDao();
		DaoInterface dao = new DatabaseDao();
		
		View view = new View();
		CustomerManager customerManager = new CustomerManager(dao, view);
//		BankAccountManager bankAccountManager = new BankAccountManager(dao, view);
		
		customerManager.addCustomer(94010112345L, "Tomek", "Majewski", "asd123", "Podgorna", "Zielona Gora", "00-000");
		//bankAccountManager.createBankAccount(94010112345L, 11111111111L, 1000);
		
		//customerManager.addCustomer(91234512132L, "Marcin", "Kaminski", "ddd333", "Krotka", "Zary", "68-200");
		//Customer customer = customerManager.findCustomerById(94010112345L);
		//System.out.println(customer);
		//System.out.println(customerManager.getCurrentCustomerInformation(customer));
		//customerManager.updateCustomer(new Customer(94010112345L, "111sd", "asd", "asd", new Address("asd", "asd", "asd")));
		//System.out.println(customerManager.getCurrentCustomerInformation(customer));
//		customerManager.printAllCustomersInfo(); //TODO: not working correctly
//		customerManager.printCustomerInfoById(94010112345L);
		customerManager.deleteCustomerById(94010112345L);
		//customerManager.deleteCustomerById(91234512132L);
		
		dao.closeConnection();
	}	

}