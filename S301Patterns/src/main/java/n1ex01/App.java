package n1ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Undo undo = Undo.getInstance();
		Undo undo2 = Undo.getInstance();
		undo2.addOrder(null);
		int opcio;

		do {
			opcio = menu();

			switch (opcio) {
			case 1:
				String order = undo.requestOrder();
				undo.addOrder(order);
				break;
			case 2:
				String orderRemove = undo.requestRemoveOrder();
				undo.removeOrder(orderRemove);
				break;
			case 3:
				undo.showOrders();
				break;
			case 4:
				System.out.println("Leaving the app");
				break;

			default:
				System.out.println("Insert a valid number(between 1 - 4).");
			}
		} while (opcio != 4);

	}

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		System.out.println("*** Welcome to order manager ***\n" + "1- add order to our database.\n"
				+ "2- remove order from our data base .\n" + "3- Show all orders in our database .\n"
				+ "4- Exit app.\n");
		option = sc.nextInt();

		return option;
	}

}
