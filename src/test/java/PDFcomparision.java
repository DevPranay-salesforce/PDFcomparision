import java.io.IOException;

import de.redsix.pdfcompare.PdfComparator;

public class PDFcomparision {
 public static void main(String[] args) throws IOException {
	 
	 try {
		new PdfComparator("PDFcomparision11\\com11.pdf", "PDFcomparision11\\com222.pdf").withIgnore("Ignore.conf").compare().writeTo("diffOutput");
		System.out.println("Process Completed.....");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	 boolean isEquals = new PdfComparator("PDFcomparision11\\com11.pdf","PDFcomparision11\\com222.pdf").withIgnore("Ignore.conf").compare().writeTo("diffOutput");
	 if (!isEquals) {
		 System.out.println("Is PDF is same :" +isEquals);   
	     System.out.println("Differences found!!!!!!22!!!!!");
	 }
}
}
