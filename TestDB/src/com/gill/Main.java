package com.gill;

import java.sql.*;

public class Main {

    public static final String DB_NAME="testjava.db";
    public static final String CONNECTION_STRING="jdbc:sqlite:/Users/rashpalgill/training/JavaMasterClass/TestDB/" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) throws SQLException {
//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/rashpalgill/training/JavaMasterClass/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            statement.execute("Drop table if exists " + TABLE_CONTACTS);
            statement.execute("create table if not exists " +
                    TABLE_CONTACTS + " ( " + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text )");


            insertContact(statement, "Tim", 3423452, "tim@email.com");
            insertContact(statement, "Joe", 234, "joe@email.com");
            insertContact(statement, "jane", 234234, "jane@email.com");
            insertContact(statement, "Fido", 234, "fido@email.com");



            statement.execute("update " +
                            TABLE_CONTACTS + " set " +
                            COLUMN_PHONE + "=123 where " +
                            COLUMN_NAME + "='satwant'");


            statement.execute("delete from " +
                            TABLE_CONTACTS + " where " +
                            COLUMN_NAME + "='Tim'");

//            statement.execute("select * from contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("select *from " +
                    TABLE_CONTACTS );
            while(results.next()) {
                System.out.println( results.getString(COLUMN_NAME) +" " +
                        results.getInt(COLUMN_PHONE) +" " +
                        results.getString(COLUMN_EMAIL)  );
            }
            results.close();

            conn.commit();

        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            if(statement != null) {
                statement.close();
            }

            if(conn != null) {
                conn.close();
            }
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("insert into " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +
                "values('" + name + "'," + phone + ", '" + email +  "')");
    }
}
