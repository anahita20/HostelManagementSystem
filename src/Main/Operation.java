package Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import GUI.FeeStatus;

public class Operation extends JOptionPane
{
	private static final long serialVersionUID = 1L;

	public void addEntry(String Studid,String name,String address,String phone,String dob,String college, String yos,String roomno, String doj, String gname, String gphone)
	{
		Connection con = DBConnection.Link();
		try {
			PreparedStatement ps = con.prepareStatement("insert into student(StudentId,Name,Address,Phone,DOB,College,YearOfStudy,RoomNo,DateofJoin,GuardianName,GuardianPhone) values(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,Studid);
			ps.setString(2,name);
			ps.setString(3,address);
			ps.setString(4,phone);
			ps.setString(5,dob);
			ps.setString(6,college);
			ps.setString(7,yos);
			ps.setString(8,roomno);
			ps.setString(9,doj);
			ps.setString(10,gname);
			ps.setString(11,gphone);
			
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	public void Display()
	{
		Connection con = DBConnection.Link();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Student");
			ResultSet rs = ps.executeQuery();
			DisplayPane(rs);
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DisplayFee()
	{
		Connection con = DBConnection.Link();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Fees");
			ResultSet rs = ps.executeQuery();
			DisplayPane(rs);
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DisplayRoom()
	{
		Connection con = DBConnection.Link();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Rooms");
			ResultSet rs = ps.executeQuery();
			DisplayPane(rs);
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DisplayPane(ResultSet rs)
	{
		try
		{
		JTable table = new JTable(buildTableModel(rs));
		
		 JOptionPane.showMessageDialog(null, new JScrollPane(table));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static DefaultTableModel buildTableModel(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);
	}
	public boolean Search(String vno)
	{
		int flag=-1;
		Connection con = DBConnection.Link();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Student where StudentId = ?");
			ps.setString(1,vno);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				rs.previous();
				DisplayPane(rs);
				flag=1;
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==1)
			return true;
		else
			return false;
	}

	public void Delete(String StudentId)
	{
		Connection con = DBConnection.Link();
		try {
			PreparedStatement ps = con.prepareStatement(" delete from Fees where StudentId= ?");
			ps.setString(1,StudentId);
			ps.executeUpdate();
			PreparedStatement p = con.prepareStatement(" delete from Student where StudentId= ?");
			p.setString(1,StudentId);
			p.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isStudentIdRegistered(String sid) {
		Connection con = DBConnection.Link();
		try {
			Statement stmt=con.createStatement();
			  String query = "SELECT * FROM Student WHERE StudentId='" + sid + "'"; 
			 ResultSet rs= stmt.executeQuery(query);
			 if(rs.next())
					 return true;
				 else
				 return false;
		}
		
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return true;
		}
	  
	 
	
	   }
	
	public void updatefeestatus(String SID)
	{
		Connection con = DBConnection.Link();
		try {
			boolean b=isStudentIdRegistered(SID);
			if(b==true){
			Statement stmt=con.createStatement();
			String query="Update Fees SET FeeStatus= 'Paid'  WHERE StudentId= " + SID+"";
			stmt.executeUpdate(query);
			FeeStatus fee=new FeeStatus();
			fee.message();
			}
			else 
				JOptionPane.showMessageDialog(null, "Student Id does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
				
           con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Update(String sid,String name,String address,String phone,String dob,String college, String yos, String gname, String gphone)
	{
		Connection con = DBConnection.Link();
		try {
			PreparedStatement ps = con.prepareStatement("update student set Name=?,Address=?,Phone=?,DOB=?,College=?,YearOfStudy= ?,  GuardianName=?,GuardianPhone=? where StudentID =?");
			
			ps.setString(1,name);
			ps.setString(2,address);
			ps.setString(3,phone);
			ps.setString(4,dob);
			ps.setString(5,college);
			ps.setString(6,yos);
			ps.setString(7,gname);
			ps.setString(8,gphone);
			ps.setString(9,sid);
			
			ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	




}