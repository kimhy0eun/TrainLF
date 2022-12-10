package application;
import java.util.HashMap;

public class loginDB {
	private HashMap<String, String> table;
	String crew;
	public loginDB() {
		table = new HashMap<>();
		table.put("ktx1234","1234");
		table.put("srt1214","1214");
		table.put("m1111","1111");
		table.put("ktx5678","5678");
		table.put("srt1225","1225");
		table.put("m2222","2222");	
	}
	public String getPassword(String DB_id) {
		return table.get(DB_id);
	}
}