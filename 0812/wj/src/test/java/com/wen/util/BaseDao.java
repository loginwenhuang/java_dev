package com.wen.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {

	//四大金刚
	//驱动类
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	//连接地址
	private static final String URL="jdbc:mysql://localhost:3306/school_db?useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
	//用户名
	private static final String USER="muxiaowen";
	//密码
	private static final String PASSWORD="123456";



	//获取连接
	public static Connection getConnection(){

		Connection con = null;

		try{
			//加载驱动类
			Class.forName(DRIVER);
			//获取连接
			con = DriverManager.getConnection(URL,USER,PASSWORD);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}

		return con;
	}

	//关闭数据库对象
	public static void closeAll(Connection con,Statement st,ResultSet rs){
		
		if(rs!=null){
			try{
				rs.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}

		if(st!=null){

			try{
				st.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}

		if(con!=null){
			try{
				con.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}

	}


	//通用设置参数方法
	public static void setParams(PreparedStatement pst,Object[] params){

		if(params==null){
			return;
		}

		for(int i=0;i<params.length;i++){
			try{
				pst.setObject(i+1,params[i]);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}


	//通用增删改
	public static int executeUpdate(String sql,Object[] params){

		Connection con = null;
		PreparedStatement pst = null;
		
		int res = -1;
		
		try{

			//获取连接
			con = getConnection();
			//创建预编译命令执行对象
			pst = con.prepareStatement(sql);
			//设置参数
			setParams(pst,params);
			//执行
			res = pst.executeUpdate();

		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			closeAll(con,pst,null);
		}
		
		return res;
	}

	//获取总记录数的查询:select count(*) from ..
	public static int getTotal(String sql,Object[] params){
		int total = 0;

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try{

			con = getConnection();
			pst = con.prepareStatement(sql);
			setParams(pst,params);
			rs = pst.executeQuery();
			//判断是否查询除了一个记录
			if(rs.next()){
				total = rs.getInt(1);
			}

		}catch (Exception ex){
			ex.printStackTrace();
		}finally {
			closeAll(con,pst,rs);
		}

		return total;
	}


	//通用查询
	public static List<Map<String,Object>> executeQuery(String sql,Object[] params) {

		List<Map<String,Object>> rows = new ArrayList<>();

		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try{
			//获取连接	
			con = getConnection();			
			//获取命令对象
			pst = con.prepareStatement(sql);
			//设置参数
			setParams(pst,params);
			//执行查询
			rs = pst.executeQuery();

			//通过rs获取结果集的结构信息
			ResultSetMetaData rsmd =  rs.getMetaData();
			//获取结果集的列数
			int colCount = rsmd.getColumnCount();

			//遍历查询结果，并封装到List<Map>中
			while(rs.next()){
				//用Map存储当前行的各个列数据
				Map<String,Object> map = new HashMap<>();
				//循环获取每一列的信息
				for(int i=1;i<=colCount;i++){
					//获取列名(使用rsmd)
					String colName = rsmd.getColumnLabel(i);
					//获取列值(使用rs)
					Object colVal = rs.getObject(i);
					//将当前列存储到map中
					map.put(colName,colVal);								
				}
				
				//将遍历的当前行的数据存储到List中
				rows.add(map);
							
			}


		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			closeAll(con,pst,rs);
		}
		
		return rows;

	}

}