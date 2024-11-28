/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
/**
 *
 * @author marav
 */
    public class DBConnection {
        public static void main(String args[]) {
        
    }
        private static final String URL = "jdbc:mysql://localhost:3306/hotel_management?zeroDateTimeBehavior=CONVERT_TO_NULL";
        private static final String USER = "root";
        private static final String PASS = "";
     
        public static Connection getConnection(){
         
         Connection connection = null;
         
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             
             connection = DriverManager.getConnection(URL,USER,PASS);
             System.out.println("Connection Complete! ");
             
         }catch (SQLException e){
                System.out.println("Error connecting to the database " + e.getMessage());
         }catch(ClassNotFoundException e){
                System.out.println("MYSQL JDBC Driver not found: " + e.getMessage() );
             
         }
     return connection;
     }

     public static void closeConnection (Connection connection){
           if(connection !=null){
        try {
                connection.close();
                System.out.println("Connection closed");
        }catch(SQLException e){
            System.out.println("Error closing the connection" + e.getMessage());

}
}

}
}
