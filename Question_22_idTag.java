package assignments.assignment_10;

public class Question_22_idTag {

	public static void main(String[] args) {
//		Write a program, that will read HTML variable and output attribute value of id attribute (tag) into the console. 
//		Input will be provided in a single line as outlined below. If HTML variable doesn't contain <html> attribute, print out into the console message: "Invalid input!".
		
		System.out.println(
				idTag("<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>"));
	}

	public static String idTag(String htmlCode) {

		if (htmlCode.contains("<html>")) {
			return "Invalid input!";
		}
		int firstIndex = htmlCode.indexOf("id=\"");
		int secondIndex = htmlCode.indexOf("\"", firstIndex + 4);
		String id = htmlCode.substring(firstIndex + 4, secondIndex);

		return id;

	}
}
