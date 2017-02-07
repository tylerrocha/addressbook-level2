package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {

	private Tag tag;
	private Person person;
	
	/** 
	 * If true, this tag was added and a '+' will be printed.
	 * If false, this tag was deleted and a '-' will be printed. 
	 */
	private boolean isAddedTag;
	
	public Tagging(Tag tag, Person person, boolean isAddedTag) {
		this.tag = tag;
		this.person = person;
		this.isAddedTag = isAddedTag;
	}
	
	public String getTagging() {
		String sign = "";
		if (isAddedTag) {
			sign = "+ ";			
		} else {
			sign = "- ";
		}
		
		return sign + person.getName().toString() + " " + tag.toString();
	}
}
