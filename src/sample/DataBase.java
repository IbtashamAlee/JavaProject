package sample;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DataBase {
    public static final String database = ("jdbc:sqlite:C:\\Users\\Ibtasham Alee\\Desktop\\Project\\Contacts.db");
    public static final String create_contacts_table = ("CREATE TABLE IF NOT EXISTS Contacts " +
            " (firstName TEXT,lastName TEXT,dateOfBirth TEXT,gender TEXT, phoneNumber TEXT, email TEXT,address TEXT)");
    private static Connection conn;
    private static Statement stat;
    private static String table_contacts = "Contacts";
    private static String fieldsOfContacts = " (firstName, lastName, dateOfBirth,gender,phoneNumber,email,address)";


    public static void writeToDatabase(String firstName, String lastName, String dateOfBirth, String gender, String phoneNumber, String email, String address) {
        try {
            conn = DriverManager.getConnection(database);
            System.out.println("Connection Established");
            stat = conn.createStatement();
            stat.execute(create_contacts_table);


            String query = String.format("INSERT INTO " + table_contacts + fieldsOfContacts +
                            " VALUES(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\")",
                    firstName, lastName, dateOfBirth, gender, phoneNumber, email, address);

            stat.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<SetValues_TableView> readFromDataBase() throws SQLException {
        ArrayList<SetValues_TableView> s1 = new ArrayList<>();
        String name, number;
        String sql = "SELECT firstName, lastName, phoneNumber FROM Contacts;";

        try (
                Connection conn1 = DriverManager.getConnection(database);
                Statement stat1 = conn1.createStatement();
                ResultSet rs = stat1.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                name = rs.getString("firstName") + " " +
                        rs.getString("lastName");
                number = rs.getString("phoneNumber");
                s1.add(new SetValues_TableView(name, number));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(s1);
        return s1;
    }

    public static void updateData(String phoneNumber) {
        String sql = String.format("Select * from Contacts Where phoneNumber = %s;", phoneNumber);
        try {
            Connection conn1 = DriverManager.getConnection(database);
            Statement stat1 = conn1.createStatement();
            ResultSet rs = stat1.executeQuery(sql);
            rs.next();
            AddContacts a = new AddContacts();
            a.setFirstName(rs.getString("firstName"));
            a.setLastName(rs.getString("lastName"));
            a.setPhoneNumber(rs.getString("phoneNumber"));
            a.setEmail(rs.getString("email"));
            a.setDateOFBirth(LocalDate.parse((String) (rs.getString("dateOfBirth"))));
            a.setAddress(rs.getString("address"));
            //System.out.println("hi"+rs.getString("address"));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
