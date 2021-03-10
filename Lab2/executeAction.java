public String executeAcion() throws Exception
{
	this.inputCustomer = __inputCustomer == null ? null : myfirstmodule.proxies.Customer.initialize(getContext(),__inputCustomer);
	String customerName = this.inputCustomer.getName(this.getContext());
	return new StringBuilder(customerName).reverse().toString();
}
