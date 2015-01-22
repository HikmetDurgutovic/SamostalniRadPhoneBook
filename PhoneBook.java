package ba.bitcamp.hikmet.homework.phonebook;

/**
 * Assignment is to create a phonebook program which will
 * have the options: 
 * 1.Add a contact
 * 2.Edit a contact
 * 3.Print one contact
 * 4.Print all contacts
 * 5.End
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
	HashMap<String, LinkedList<Integer>> phonebook;
	Set<String> contacts;

	/**
	 * Default constructor; 
	 * Creates a phonebook;
	 */
	public PhoneBook() {
		phonebook = new HashMap<String, LinkedList<Integer>>();
		contacts = phonebook.keySet();
	}

	/**
	 * Method that adds a contact to the phonebook;
	 * 
	 * @param name
	 * @param brojTelefona
	 */
	public void addContact(String name, int brojTelefona) {
		LinkedList<Integer> nameb = new LinkedList<Integer>();
		nameb.add(brojTelefona);
		phonebook.put(name, nameb);
	}

	/**
	 * Adds a number to an existing contact name which need to be entered;
	 */
	public void addNumbertoExisting(String name, int newphonenum) {
		phonebook.get(name).add(newphonenum);
	}

	/**
	 * Method that prints only one contact;
	 */
	public void printContact(String name) {
		Iterator<String> iterName = contacts.iterator();
		while (iterName.hasNext()) {
			String namefromP = iterName.next();
			if (namefromP.equals(name)) {
				System.out.println(name + "\nNumbers : ");
				Iterator<Integer> listNumIter = phonebook.get(name).iterator();
				while (listNumIter.hasNext()) {
					int num = listNumIter.next();
					System.out.println("	" + num);
				}
			}
		}
	}

	/**
	 * To String method that prints all the names and numbers of all the
	 * contacts;
	 */
	public void toSortOfString() {
		
		Iterator<String> iterName = contacts.iterator();
		while (iterName.hasNext()) {
			String namefromP = iterName.next();
			System.out.println(namefromP + "\nNumbers : ");
			Iterator<Integer> listNumIter = phonebook.get(namefromP).iterator();
			while (listNumIter.hasNext()) {
				int num = listNumIter.next();
				System.out.println("	" + num);
			}
		}
	}

}