package n1ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class Undo {

	private static Undo instance;
	private ArrayList<String> orders;

	private Undo() {
		this.orders = new ArrayList<String>();
	}

	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}

	public String requestOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the order you want to save");
		return sc.next();

	}

	public String requestRemoveOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the order you want to remove from our database");
		return sc.next();

	}

	public void addOrder(String order) {
		orders.add(order);
		System.out.println(orders);

	}

	public void showOrders() {
		for (String order : orders) {
			System.out.println(order);
		}
	}

	public void removeOrder(String orderToRemove) {
		boolean finded = false;

		if (orders.isEmpty()) {
			System.out.println("There are no orders in our database!!");
		} else {
			Iterator<String> it = orders.iterator();
			while (it.hasNext()) {
				String order = it.next();
				if (order.equals(orderToRemove)) {
					finded = true;
					it.remove();
				}
			}
			if (finded == false) {
				System.out.println(" The order is not in our database!!");
			}
			System.out.println(orders);
		}
	}
}
