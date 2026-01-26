package Previous_M1;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class ForensicReport_Collections_Maps {

	public static void main(String[] args) {
		ForensicReport fr =  new ForensicReport();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of reports to be added");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the forensic reports: ");
		for(int i=0;i<n;i++) {
			String inp = sc.nextLine();
			String[] parts = inp.split(":");
			String officername = parts[0];
			LocalDate dt = LocalDate.parse(parts[1], DateTimeFormatter.ofPattern("yyyy-MM-dd")); // we should use DateTimeFormatter if we change the format rather than yyyy-MM-dd (This is default format)
			fr.addReportDetails(officername,dt);
		}
		System.out.println("Enter the date filed to identify officers");
		String dateStr = sc.nextLine();
		LocalDate date = LocalDate.parse(dateStr);
		List<String> filtered = fr.getOfficersWhoFiledReportsOnDate(date);
		if(filtered.isEmpty()) {
			System.out.println("No cake Orders found");
		}else {
			for(String str : filtered) {
				System.out.println(str);
			}
		}
		sc.close();
		
	}

}
class ForensicReport{
	private Map<String,LocalDate> reportMap;
	ForensicReport(){
		reportMap = new HashMap<>();
	}
	public void addReportDetails(String officerName,LocalDate reportFiledDate) {
		reportMap.put(officerName, reportFiledDate);
	}
	public List<String> getOfficersWhoFiledReportsOnDate(LocalDate reportFiledDate){
		List<String> result = new ArrayList<>();
		for(Map.Entry<String,LocalDate> entry: reportMap.entrySet()) {
			if(reportFiledDate.equals(entry.getValue())) {
				result.add(entry.getKey());
			}
		}
		return result;
	}
	
}
