package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Teacher;
import com.resource.DbConnection;

public class TeacherDao {
	public static List<Teacher> list() throws SQLException {
        List<Teacher> listTeacher = new ArrayList<>();
         
        try (Connection conn = DbConnection.getDbConn()) {
            
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Teacher ORDER BY name");
            ResultSet resultSet = pstmt.executeQuery();
             
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Teacher teacher = new Teacher(id, name);
                     
                listTeacher.add(teacher);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listTeacher;
    }

}
