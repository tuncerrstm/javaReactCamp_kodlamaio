package interfacesHomeWork;

public class CustomerManager {

	private iCustomerDal customerDal;
	
	public CustomerManager(iCustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	public void add() {
		//i� kodlar� buraya yaz�l�r.
		customerDal.Add();
	}
}
