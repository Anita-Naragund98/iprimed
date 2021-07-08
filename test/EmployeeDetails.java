import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class EmployeeDetails {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iprimed", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select * from employee");
			while (result.next()) {
				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3) + " "
						+ result.getInt(4) + " " + result.getString(5));

			}

		} catch (Exception e) {
			System.out.println(e);

		}

	}

}