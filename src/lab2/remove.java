package lab2;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.* ;
import java.util.*;
public class remove extends ActionSupport{
private String ISBN;

public String execute() {
    try{
        Class.forName("com.mysql.jdbc.Driver") ;
        String url ="jdbc:mysql://172.20.87.112:3306/BOOK" ;
        Connection conn = DriverManager.getConnection(url,"root","fhz1997") ;
    Statement statement = conn.createStatement();
    String nowsql = "delete from bookinfo where ISBN = \""+ISBN+"\";";
    statement.execute(nowsql);
    conn.close();
    return "ok";
    }catch(Exception e){
        System.out.println("failure!!!");
    }
	return "fail";
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}
}