package application;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("designfxml.fxml"));
			Scene scene = new Scene(root,250,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("Calculatorfx");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		launch(args);
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/foodie?severTimezone=UTC";
        String user = "root";
        String password = "";
        //connection with driver
        Connection c1 = DriverManager.getConnection(url, user, password);
        //creaate a statement
        Statement s = c1.createStatement();
        s.executeUpdate("Create Table A (B int(5))");
		
	}
}
