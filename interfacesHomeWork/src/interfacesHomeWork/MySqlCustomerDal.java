package interfacesHomeWork;

public class MySqlCustomerDal implements iCustomerDal, iRepository {

	@Override
	public void Add() {
		System.out.println("My SQL eklendi.");
		
	}

}
