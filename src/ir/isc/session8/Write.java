package ir.isc.session8;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class Write {
	
	public static <ObjectMapper> void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Account acc1 = new Account();
		acc1.setName("Kiana Mohammad Hosseini");
		acc1.setBalance(54000000);
		acc1.setTransaction(null);
		
		ObjectMapper objmapper = new ObjectMapper();
		objmapper.writerWithDefaultPrettyPrinter().writeValue(new File("MohammadHosseini.json") , acc1);
	}
	

}
