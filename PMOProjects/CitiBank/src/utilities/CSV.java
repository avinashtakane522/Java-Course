package utilities;

import java.util.*;
import java.io.*;

public class CSV {

	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String rowData;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((rowData = br.readLine()) != null) {
				String[] dataRecord = rowData.split(",");
				data.add(dataRecord);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found at the given location.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An I/O error occurred while reading the file.");
			e.printStackTrace();
		}

		return data;
	}
}
