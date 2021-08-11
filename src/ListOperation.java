import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ListOperation {

	private Formatter listFileFormatter;
	private Scanner listFileScanner;
	private FileWriter listFileWriter;
	
	private String fileName;
	
	public ListOperation (String fileName){
		
		this.fileName = fileName;
	}
	
	public void openFormatter(boolean append){
		
            try{
			
		listFileWriter = new FileWriter(fileName, append);
		listFileFormatter = new Formatter(listFileWriter);
		listFileScanner = new Scanner(new File(fileName));
			
            }catch(Exception e){
		JOptionPane.showMessageDialog(null, "File Scanner Openning Fialed");
            }
	}
	
	public void addData(List list){
		
		openFormatter(true);
		listFileFormatter.format("%s %s %s %s\n", list.getID(),list.getName(),list.getPhone(),list.getDepartment());
		listFileFormatter.close();	
	}
	

	public ArrayList<List> getList(){
		
		openFormatter(true);
		ArrayList<List> list = new ArrayList<>();
		
		while(listFileScanner.hasNext()){
			
                        String id = listFileScanner.next();
			String name = listFileScanner.next();
			String Phone = listFileScanner.next();
                        String dep = listFileScanner.next();
			list.add(new List(id, name, Phone, dep));	
		}		
		return list;
	}

	public void writeList(ArrayList<List> alldata) {
		
		openFormatter(false);
		
		for (List member : alldata) {
			listFileFormatter.format("%s %s %s %s\n",member.getID(), member.getName(),member.getPhone(),member.getDepartment());
			
		}
		listFileFormatter.close();
	}
}

