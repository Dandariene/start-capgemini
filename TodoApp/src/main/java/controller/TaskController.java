package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import util.ConnectionFactory;

public class TaskController {

    public void save(Task task) {

    }

    public void update(Task task) {

    }

    public void removeById(int taskId) {
        
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
            
        } catch (SQLException e) {
            throw new 
        }

    }

    public List<Task> getAll(int idProject){
    return null;
    }
}
