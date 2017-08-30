package reporting;

public class ReportFormatter {
	String formattedOutput;
	
	public ReportFormatter(Object object, FormatType formatType){
		switch(formatType){
		case XML:
			formattedOutput = convertObjToXML(object);
			break;
		case CSV:
			formattedOutput = convertObjToCSV(object);
			break;
		}
	}
	
	private String convertObjToXML(Object obj){
		return "Converted Object To XML";
	}
	
	private String convertObjToCSV(Object obj){
		return "Converted Object To CSB";
	}
	
	public String getFormattedValue(){
		return formattedOutput;
	}

}
