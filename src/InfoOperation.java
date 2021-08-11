import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InfoOperation {
    
    private Formatter infoFileFormatter;
	private Scanner infoFileScanner;
	private FileWriter infoFileWriter;
	
	private String fileName;
	
	public InfoOperation (String fileName){
		
		this.fileName = fileName;
	}
	
	public void openFormatter(boolean append){
		
            try{	
		infoFileWriter = new FileWriter(fileName, append);
		infoFileFormatter = new Formatter(infoFileWriter);
		infoFileScanner = new Scanner(new File(fileName));
			
            }catch(Exception e){
		JOptionPane.showMessageDialog(null, "File Scanner Openning Fialed");
            }
	}
	
	public void addInfo(Info info){
		
		openFormatter(true);
		infoFileFormatter.format("%s %s %s\n", info.getID(),info.getTrimester(),info.getCGPA());
		infoFileFormatter.close();	
	}
	

	public ArrayList<Info> getInfo(){
		
		openFormatter(true);
		ArrayList<Info> info = new ArrayList<>();
		
		while(infoFileScanner.hasNext()){
			
                        String id = infoFileScanner.next();
			String tri = infoFileScanner.next();
			String cgpa = infoFileScanner.next();
			info.add(new Info(id, tri, cgpa));	
		}		
		return info;
	}

	public void writeInfo(ArrayList<Info> allinfo) {
		
		openFormatter(false);
		
		for (Info member : allinfo) {
			infoFileFormatter.format("%s %s %s\n",member.getID(), member.getTrimester(), member.getCGPA());
			
		}
		infoFileFormatter.close();
	}
    
    
    
}
