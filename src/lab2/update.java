package lab2;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.* ;
import java.util.*;

public class update extends ActionSupport{
private String ISBN;
private String Title;
private String AuthorName;
private String Price;
private String Publisher;
private String Date;
private String Age;
private String Country;

public String execute() {
	Integer authorid = null;
    try{
        Class.forName("com.mysql.jdbc.Driver") ;
        String url ="jdbc:mysql://172.20.87.112:3306/BOOK" ;
        Connection conn = DriverManager.getConnection(url,"root","fhz1997") ;
    Statement statement = conn.createStatement();
    String nowsql = "";
    try{
        nowsql = "select authorID from anthor where name ="+"\""+AuthorName+"\";";
        ResultSet rs = statement.executeQuery(nowsql);
        System.out.println(nowsql);
        if(rs.next()){
        	authorid = rs.getInt("authorID");	
        }
        else{
        	nowsql = "insert anthor (name,age,country)values(\""+AuthorName+"\","+"\""+Age+"\",\""+Country+"\");";
        	System.out.println(nowsql);
        	statement.execute(nowsql);
            nowsql = "select authorID from anthor where name ="+"\""+AuthorName+"\";";
            rs = statement.executeQuery(nowsql);
            System.out.println(nowsql);
            while(rs.next()){
            	authorid = rs.getInt("authorID");
            }
        	
        }
        /*update author*/
    }catch(Exception e){
    	return "fail";
    }
    nowsql = "update bookinfo set title = \""+Title+"\",authorid = \""+authorid.toString()+"\",publisher=\""+Publisher+"\",publishdata=\""+Date+"\",price=\""+Price +"\" "+"where ISBN = \""+ISBN+"\";";
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

public String getTitle() {
	return Title;
}

public void setTitle(String title) {
	Title = title;
}

public String getPrice() {
	return Price;
}

public void setPrice(String price) {
	Price = price;
}

public String getAuthorName() {
	return AuthorName;
}

public void setAuthorName(String authorName) {
	AuthorName = authorName;
}

public String getPublisher() {
	return Publisher;
}

public void setPublisher(String publisher) {
	Publisher = publisher;
}

public String getDate() {
	return Date;
}

public void setDate(String date) {
	Date = date;
}

public String getAge() {
	return Age;
}

public void setAge(String age) {
	Age = age;
}

public String getCountry() {
	return Country;
}

public void setCountry(String country) {
	Country = country;
}
}
