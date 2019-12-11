package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    public static final String database = ("jdbc:sqlite:D:\\JavaFX-More-on-SceneBuilder-Source-code\\src\\sample\\Contactssss.db");
    public static final String create_contacts_table = ("CREATE TABLE IF NOT EXISTS Contacts " +
            " (firstName TEXT,lastName TEXT,dateOfBirth TEXT,gender TEXT, phoneNumber INTEGER, email TEXT,address TEXT)");
    private static Connection conn;
    private static String table_contacts = "Contacts";
    private static String fieldsOfContacts = "(firstName, lastName, dateOfBirth,gender,phoneNumber,email,address)";


    private static DataBase instance = new DataBase();

    private DataBase() {

    }

    public static DataBase getInstance() {
        return instance;
    }

    public static void writeToDatabase(String firstName, String lastName, String dateOfBirth, String gender, int phoneNumber, String email, String address) {
        try {
            conn = DriverManager.getConnection(database);
            System.out.println("Connection Established");
            Statement stat = conn.createStatement();
            stat.execute(create_contacts_table);


            String query = String.format("INSERT INTO" + table_contacts + fieldsOfContacts +
                            "VALUES(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\")",
                    firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);

            stat.execute(query);
//            ResultSet results = stat.getResultSet ();
//            while (results.next ()) {
//                System.out.println (results.getString ("name") + " " +
//                        results.getInt ("phone") + " " +
//                        results.getString ("email"));
//            }
//
//            results.close ();

            stat.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
//            System.out.println ("Something went Wrong "+e.getMessage ());
        }
    }


}
