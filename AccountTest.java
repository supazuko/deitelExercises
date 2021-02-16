public class AccountTest{
	public static void main(String[] args) {
	Account myAccount = new Account("Lisa", 200);
	
	System.out.println(myAccount.getName() + myAccount.getBalance());
	
	myAccount.deposit(200);
	System.out.println(myAccount.getBalance());

	myAccount.setName("Mona");
	System.out.println(myAccount.getName());	

}
}