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
            throw new RuntimeException(e);
        }
    }

    public String insertData(Charger charger) {
        try {
        String sql = " INSERT INTO  `online-shop`.charger"
                + " VALUES(?,?,?,?)"
                + "set color=" + charger.getColor()
                + "set brand=" + charger.getBrand()
                + "set productYear =" + charger.getProductYear();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "id");
        preparedStatement.setString(2, "color");
        preparedStatement.setString(3, "brand");
        preparedStatement.setString(4, "productYear");
        boolean execute = preparedStatement.execute();
        if (execute) {
            System.out.println("insert complicated");
        } else {
            System.out.println("insert have error");
        }
    }catch (SQLException sqlException){
            return "we have an error";
        }
        return null;
    }


    public void updateCase(Case caseModel)  {
        try {
        Statement smt = connection.createStatement();
        String updatdate = "update `online-shop`.case "
                + " set size=" + caseModel.getSize()
                + " set processNumber=" + caseModel.getProcessNumber()
                + " set graficModel=" + caseModel.getGraficModel()
                + "where id=" + caseModel.getId();
        smt.executeUpdate(updatdate);
    }
        catch (SQLException sql){
            return ;
        }
      }


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
            return "eror is occured";
        }
    }
    public Object selectData(String table, int id) {
        try {

            String sqlSelectAllPersons = "SELECT * FROM `online-shop`." + table + " WHERE id= " + id;
            PreparedStatement ps = connection.prepareStatement(sqlSelectAllPersons);
            return ps.executeQuery(sqlSelectAllPersons);
        }catch (SQLException sqlException){
            return "error is occured";
        }
    }



}
