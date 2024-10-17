package utilities;

import java.util.*;
import java.io.*;

public class CSV {
	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
			
		}catch(Exception e){
			System.out.println("Could not read file");
			e.printStackTrace();
		}
		
		return data;
	}
}
