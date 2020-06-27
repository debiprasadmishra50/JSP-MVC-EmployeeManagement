package com.model;

import java.sql.*;
import java.util.ArrayList;

import com.db.Employee;
import com.db.Provider;

public class EmployeeDao 
{
	public static int  addNewUser (Employee e)
	{
		int status = 0 ; 
		
		try 
		{
			Connection con=Provider.getOracleConnection();
			String sql="insert into Employee values (?,?,?,?,?,?)";
			PreparedStatement pst  = con.prepareStatement(sql);
			
			pst.setInt(1,e.getEid());
			pst.setString(2,e.getEname());
			pst.setDouble(3, e.getSalary());
			pst.setString(4, e.getEmail());
			pst.setString(5, e.getPassword());
			pst.setLong(6, e.getPhone());
			
			status = pst.executeUpdate();
		
		} 
		catch (Exception e2) 
		{
			e2.printStackTrace();
			
		}
		return status;
	}
	public static int  doUpdateNowRecord (Employee e)
	{
		int status = 0 ; 
		
		try 
		{
			Connection con=Provider.getOracleConnection();
			String sql="update Employee set ename=? , salary=? , email=? , phone=? where eid=?";
			PreparedStatement pst  = con.prepareStatement(sql);
			
			pst.setInt(5,e.getEid());
			pst.setString(1,e.getEname());
			pst.setDouble(2, e.getSalary());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getPhone());
			
			status = pst.executeUpdate();
		
		} 
		catch (Exception e2) 
		{
			e2.printStackTrace();
			
		}
		return status;
	}
	public static ArrayList<Employee>  getAllRecords ()
	{
		ArrayList<Employee> allEmp = new ArrayList<Employee>();
		try 
		{
			Connection con=Provider.getOracleConnection();
			String sql="select * from Employee";
			PreparedStatement pst  = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setEid(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setSalary(rs.getDouble(3));
				e.setEmail(rs.getString(4));
				e.setPassword(rs.getString(5));
				e.setPhone(rs.getLong(6));
				allEmp.add(e);
			}
		 
		} 
		catch (Exception e2) 
		{
			e2.printStackTrace();
			
		}
		return allEmp;
	}
	public static int  deleteRecord (Employee e)
	{
		int status = 0 ; 
		
		try 
		{
			Connection con=Provider.getOracleConnection();
			String sql="delete from Employee where eid=?";
			PreparedStatement pst  = con.prepareStatement(sql);
			pst.setInt(1,e.getEid());
			status = pst.executeUpdate();
		} 
		catch (Exception e2) 
		{
			e2.printStackTrace();
			
		}
		return status;
	}
}
