import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcConnect {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1522:xe";
		String id = "KIM1995";
		String pw = "kim1995";
		
		Connection conn = DriverManager.getConnection(url,id,pw);
		
		return conn;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Connection conn = getConnection();
		
		String sql = "SELECT * FROM KOPO_PRODUCT_VOLUME";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		ArrayList<Info> list = new ArrayList<Info>();
		
		while(rs.next()) {
			Info info = new Info();
			info.setRegionid(rs.getString("REGIONID"));
			info.setProductgroup(rs.getString("PRODUCTGROUP"));
			info.setYearweek(rs.getString("YEARWEEK"));
			info.setVolume(rs.getInt("VOLUME"));
			list.add(info);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getRegionid());
			System.out.println(list.get(i).getProductgroup());
			System.out.println(list.get(i).getYearweek());
			System.out.println(list.get(i).getVolume());
		}
	}
	

}
