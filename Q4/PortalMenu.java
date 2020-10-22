import java.util.*;

public class PortalMenu {
	private PortalController pctrl;

    // constructor
	public PortalMenu(PortalController pctrl) {
		this.pctrl = pctrl;
	}

	// gets account to, account from and amount to transfer from user input and perform transfer
    public void processTransfer(){
		System.out.println("Bank Portal");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your account number > ");
		String accountNumber = scanner.nextLine();
		System.out.print("Enter account to transfer to > ");
		String accountToTransferTo = scanner.nextLine();
		System.out.print("Enter amount to transfer > ");
		double amount = scanner.nextDouble();
		
		if (pctrl.transfer(accountNumber, accountToTransferTo, amount)){
			System.out.print(amount + " is transferred from " + accountNumber + " to " + accountToTransferTo);
		} else{
			System.out.print(accountNumber + " has insufficient funds for transfer");
		}
    }        
}