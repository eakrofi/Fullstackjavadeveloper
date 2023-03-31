package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.Subject;
import com.resource.DbConnection;

public class SubjectDao {
	public static List<Subject> list() throws SQLException {
        List<Subject> listSubject = new ArrayList<>();
         
        try (Connection conn = DbConnection.getDbConn()) {
            
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM subject ORDER BY name");
            ResultSet resultSet = pstmt.executeQuery();
             
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int teacherId = resultSet.getInt("teacher_id");
                Subject subject = new Subject(id, name, teacherId);
                
                     
                listSubject.add(subject);
            }          
             
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        }      
         
        return listSubject;
    }
}
