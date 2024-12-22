/*************************
 * Name: 	Shahbaj Singh 
 * Course: 	CS-320 
 * Date: 	November 14, 2024
 * Description: This is the contact class. It creates and stores contact information.
 *************************/

package Test;

public class ContactTest {
    /*
     * The following tests evaluate the Contact class.
     * The first five tests verify that field lengths adhere to constraints:
     * a maximum of 10 characters for the first and last name,
     * exactly 10 characters for the phone number, and a maximum of 30 characters
     * for the address.
     * The final four tests ensure that none of these fields are null.
     * The contactID is not tested for nullability, as it cannot be created with a
     * null value,
     * nor is it tested for immutability, as there is no mechanism to update it.
     */

    @Test
    @DisplayName("Contact ID cannot have more than 10 characters")
    void testContactIDWithMoreThanTenCharacters() {
        Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", "Address");
        if (contact.getContactID().length() > 10) {
            fail("Contact ID has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact First Name cannot have more than 10 characters")
    void testContactFirstNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("OllyOllyOxenFree", "LastName", "PhoneNumbr", "Address");
        if (contact.getFirstName().length() > 10) {
            fail("First Name has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact Last Name cannot have more than 10 characters")
    void testContactLastNameWithMoreThanTenCharacters() {
        Contact contact = new Contact("FirstName", "OllyOllyOxenFree", "PhoneNumbr", "Address");
        if (contact.getLastName().length() > 10) {
            fail("Last Name has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact phone number is exactly 10 characters")
    void testContactNumberWithMoreThanTenCharacters() {
        Contact contact = new Contact("FirstName", "LastName", "55555555555", "Address");
        if (contact.getNumber().length() != 10) {
            fail("Phone number length does not equal 10.");
        }
    }

    @Test
    @DisplayName("Contact address cannot have more than 30 characters")
    void testContactAddressWithMoreThanThirtyCharacters() {
        Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr",
                "123456789 is nine characters long" + "123456789 is another nine characters long");
        if (contact.getAddress().length() > 30) {
            fail("Address has more than 30 characters.");
        }
    }

    @Test
    @DisplayName("Contact First Name shall not be null")
    void testContactFirstNameNotNull() {
        Contact contact = new Contact(null, "LastName", "PhoneNumbr", "Address");
        assertNotNull(contact.getFirstName(), "First name was null.");
    }

    @Test
    @DisplayName("Contact Last Name shall not be null")
    void testContactLastNameNotNull() {
        Contact contact = new Contact("FirstName", null, "PhoneNumbr", "Address");
        assertNotNull(contact.getLastName(), "Last name was null.");
    }

    @Test
    @DisplayName("Contact Phone Number shall not be null")
    void testContactPhoneNotNull() {
        Contact contact = new Contact("FirstName", "LastName", null, "Address");
        assertNotNull(contact.getNumber(), "Phone number was null.");
    }

    @Test
    @DisplayName("Contact Address shall not be null")
    void testContactAddressNotNull() {
        Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", null);
        assertNotNull(contact.getAddress(), "Address was null.");
    }
}
