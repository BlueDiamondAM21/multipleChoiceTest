package conn;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {

    private final static String url = "jdbc:postgressql://localhost/multiplechoiceDB";
    private final static String user = "ConnPac";
    private final static String password = "PacConn";
    public static conn connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");



        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;


    }

}
