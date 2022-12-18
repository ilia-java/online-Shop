package repository;

import products.Case;
import products.Charger;

import java.sql.*;

public class MysqlConnector {
    private final String connectionUrl = "jdbc:mysql://localhost:3306/online-shop";
    private Connection connection;

    public MysqlConnector()  {
        try {
            connection = DriverManager.getConnection(connectionUrl, "root", "ilia1382ilia");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
//
//    public String insertData(Charger charger) {
//        try {
//        String sql = " INSERT INTO  `online-shop`.charger"
//                + " values(?,?,?,?)"
//                +  " set id "  +  charger.getId()
//                +  " set color "  +  charger.getColor()
//                +  " set brand "  +  charger.getBrand()
//                +  " set productYear "  +  charger.getProductYear();
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, "id");
//        preparedStatement.setString(2, "color");
//        preparedStatement.setString(3, "brand");
//        preparedStatement.setString(4, "productYear");
//        boolean execute = preparedStatement.execute();
//        if (execute) {
//            System.out.println("insert complicated");
//        } else {
//            System.out.println("insert have error");
//        }
//    }
//        catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }


//    public void updateCase(Case caseModel)  {
//        try {
//            Statement smt = connection.createStatement();
//            String updatedate = "update `online-shop`.case "
//                    + " set size=" + caseModel.getSize()
//                    + " set processNumber=" + caseModel.getProcessNumber()
//                    + " set graficModel=" + caseModel.getGraficModel()
//                    + "where id=" + caseModel.getId();
//            smt.executeUpdate(updatedate);
//        } catch (SQLException sql){
//            System.out.println(sql.getMessage());
//        }
//      }


    public String deleteData(String table, int id) {
        String recordDelete = "DELETE FROM `online-shop`." + table + " where id=  " + id;
        try {
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(recordDelete);
            if (result == 1) {
                return "record was deleted";
            } else {
                return "record dosent exist";
            }
        } catch (SQLException sqlException) {
            return "error is occured"+sqlException.getMessage();
        }
    }
    public ResultSet selectData(String table, int id) {
        try {

            String sqlSelectAllPersons = "SELECT * FROM `online-shop`." + table + " WHERE id= " + id;
            PreparedStatement ps = connection.prepareStatement(sqlSelectAllPersons);
            return ps.executeQuery(sqlSelectAllPersons);
        }catch (SQLException sqlException){
            return null;
        }
    }



}
