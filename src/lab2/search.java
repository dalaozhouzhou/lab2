package lab2;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.*;

public class search extends ActionSupport {
	private String targetname;
	private ArrayList<String> ISBNlist;

	public String getTargetname() {
		return targetname;
	}

	public void setTargetname(String targetname) {
		this.targetname = targetname;
	}

	public String execute() {
		String name = targetname;
		ISBNlist = new ArrayList<String>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc:mysql://172.20.87.112:3306/BOOK" ;
			Connection conn = DriverManager.getConnection(url, "root",
					"fhz1997");
			Statement statement = conn.createStatement();
			String nowsql = "select authorID from anthor where name = \""
					+ name + "\";";
			System.out.println(nowsql);
			ResultSet rs = statement.executeQuery(nowsql);
			Set<Integer> IDlist = new HashSet<Integer>();
			while (rs.next()) {
				Integer authorID = rs.getInt("authorID");
				IDlist.add(authorID);
			}
			for (Iterator it = IDlist.iterator(); it.hasNext();) {
				Integer temp = (Integer) it.next();
				nowsql = "select * from bookinfo where authorid = "
						+ temp.toString() + ";";
				System.out.println(nowsql);
				rs = statement.executeQuery(nowsql);
				while (rs.next()) {
					ISBNlist.add(rs.getString("ISBN"));
					System.out.println(rs.getString("ISBN"));
				}
			}
			rs.close();
			conn.close();
			return "ok";
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
		}
		return "fail";
	}

	public ArrayList<String> getISBNlist() {
		return ISBNlist;
	}

	public void setISBNlist(ArrayList<String> iSBNlist) {
		ISBNlist = iSBNlist;
	}
}
