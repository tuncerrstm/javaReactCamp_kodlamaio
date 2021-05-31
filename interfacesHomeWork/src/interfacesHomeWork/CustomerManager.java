package interfacesHomeWork;

public class CustomerManager {

	private iCustomerDal customerDal;
	
	public CustomerManager(iCustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	
	public void add() {
		//iþ kodlarý buraya yazýlýr.
		customerDal.Add();
	}
}
