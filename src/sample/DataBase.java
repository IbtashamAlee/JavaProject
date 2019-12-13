package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    public static final String database = ("jdbc:sqlite:C:\\Users\\Ibtasham Alee\\Desktop\\Project\\Contacts.db");
    public static final String create_contacts_table = ("CREATE TABLE IF NOT EXISTS Contacts " +
            " (firstName TEXT,lastName TEXT,dateOfBirth TEXT,gender TEXT, phoneNumber INTEGER, email TEXT,address TEXT)");
    private static Connection conn;
    private static Statement stat;
    private static String table_contacts = "Contacts";
    private static String fieldsOfContacts = " (firstName, lastName, dateOfBirth,gender,phoneNumber,email,address)";


    public static void writeToDatabase(String firstName, String lastName, String dateOfBirth, String gender, int phoneNumber, String email, String address) {
        try {
            conn = DriverManager.getConnection(database);
            System.out.println("Connection Established");
            stat = conn.createStatement();
            stat.execute(create_contacts_table);


            String query = String.format("INSERT INTO " + table_contacts + fieldsOfContacts +
                            " VALUES(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\")",
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
        } catch (SQLException e) {
            e.printStackTrace();
//            System.out.println ("Something went Wrong "+e.getMessage ());
        }
    }
}
   /* public ArrayList<Std> readFromDataBase() throws SQLException {
        ArrayList arrlist;
        ResultSet results = stat.getResultSet ();
            while (results.next ()) {
                System.out.println (results.getString ("firstName") + " " +
                        results.getString ("lastName") + " " +
                        results.getInt ("phoneNumber"));
                arrlist.add();
            }

            results.close ();

        return arrlist;
    }
}*/