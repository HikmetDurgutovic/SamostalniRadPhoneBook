package ba.bitcamp.hikmet.homework.phonebook;

import java.util.Scanner;

public class TestPhonebook {

	public static void main(String[] args) {

		PhoneBook samsung = new PhoneBook();
		int input;

		do {
			System.out.println("Enter a number from 1 to 5;. "
				+ "\n1-Add a contact;"
				+ "\n2-Edit a contact;"
				+ "\n3-Print All Contacts;"
				+ "\n4-Print one contact;"
				+ "\n5-End;");
			input = TextIO.getlnInt();

			if (input == 1) {
				System.out.println("Enter name : ");
				String name = TextIO.getln();
				System.out.println("Enter number : ");
				int brojTelefona = TextIO.getlnInt();
				samsung.addContact(name, brojTelefona);
			} else if (input == 2) {
				System.out.println("Enter the name you want to add a number to : ");
				String name = TextIO.getln();
				System.out.println("Enter the number you want to add : ");
				int brojTelefona = TextIO.getlnInt();
				samsung.addNumbertoExisting(name, brojTelefona);
			} else if (input == 3) {
				samsung.toSortOfString();
			} else if (input == 4) {
				System.out.println("Enter the name of the contact you want to print the number from : ");
				String name = TextIO.getln();
				samsung.printContact(name);
			} else if (input == 5) {
				System.out.println("End");
				return;
			}
		} while (input != 5);
	}

}