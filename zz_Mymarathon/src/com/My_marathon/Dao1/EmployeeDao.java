package com.My_marathon.Dao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.My_marathon.model.employee;

public class EmployeeDao {
	public int registerEmployee(employee emp) throws SQLException
	{
		String INSERT_INTO_SQL ="insert into registration"+
	"(first_name,last_name,mid_name,Email_id,address,PhoneNumber,state,country,district,pincode,password)values"+
				"(?,?,?,?,?,?,?,?,?,?,?);";
		try{    
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");  
			//here sonoo is database name, root is username and password  
			PreparedStatement prd_st = con.prepareStatement(INSERT_INTO_SQL);
			
			prd_st.setString(1, emp.getFirstname());
			prd_st.setString(2, emp.getLastname());
			prd_st.setString(3, emp.getMid_name());
			prd_st.setString(4, emp.getEmail_id());
			prd_st.setString(5, emp.getAddress());
			prd_st.setString(6, emp.getPhoneNumber());
			prd_st.setString(7, emp.getState());
			prd_st.setString(8, emp.getCountry());
			prd_st.setString(9, emp.getDistrict());
			prd_st.setString(10, emp.getPincode());
			prd_st.setString(11, emp.getPassword());
			
			
			
			
			
		
	}
 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	
}
}
