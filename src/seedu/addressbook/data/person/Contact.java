package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

    public final String value;
    private boolean isPrivate;
	
    public Contact(String value, boolean isPrivate, String messageContactConstraints, String validationRegex) throws IllegalValueException {
        String trimmedValue = value.trim();
        this.isPrivate = isPrivate;
        if (!isValidContact(trimmedValue, validationRegex)) {
            throw new IllegalValueException(messageContactConstraints);
        }
        this.value = trimmedValue;
    }
    
    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidContact(String test, String validationRegex) {
        return test.matches(validationRegex);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
