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

    public String insertData(Charger charger) {
        try {
        String sql = "INSERT INTO `online-shop`.charger (id, color, brand, productYear) VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, charger.getId());
        preparedStatement.setString(2, charger.getColor());
        preparedStatement.setString(3, charger.getBrand());
        preparedStatement.setInt(4, charger.getProductYear());
        boolean execute = preparedStatement.execute();
        if (execute) {
            System.out.println("insert complicated");
        } else {
            System.out.println("insert have error");
        }
    }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    public void updateCase(Case caseModel)  {
        try {
            Statement smt = connection.createStatement();
            String updatedate = "UPDATE `online-shop`.case"
                    + " SET size=" + caseModel.getSize()
                    + " , processNumber=" + caseModel.getProcessNumber()
                    + " , graficModel=" + caseModel.getGraficModel()
                    + " WHERE id=" + caseModel.getId();
            smt.executeUpdate(updatedate);
        } catch (SQLException sql){
            System.out.println(sql.getMessage());
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
