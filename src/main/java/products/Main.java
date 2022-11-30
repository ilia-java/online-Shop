package products;

import repository.MysqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        MysqlConnector mysqlConnector=new MysqlConnector();
       mysqlConnector.insertData(new Charger("blue","apple",2023));
        ResultSet resultSet = mysqlConnector.selectData("person",2);
        Case caseModel = new Case(1,14, "234", 234);
        mysqlConnector.updateCase(caseModel);
        String aCase = mysqlConnector.deleteData("case", 4);
       mysqlConnector.updateCase(caseModel);



        String productOptions = new StringBuilder()
                .append("1,Case\n")
                .append("2,Pc\n")
                .append("3,charger\n")
                .append("4,Hansfri\n")
                .append("5,Keyboard\n")
                .append("6,laptop\n")
                .append("7,Maos\n")
                .append("8,Phone\n")
                .append("9,Tv\n")
                .toString();
        System.out.println(productOptions);

        System.out.println("Insert your product number: ");
        Scanner scanner = new Scanner(System.in);
        Integer choice = scanner.nextInt();

        // use switch case
        switch (choice) {
            case 1:
                Case hp = new Case(1, 7, "core i 5 ", 8);
                System.out.println(hp);

                break;
            case 2:
                Pc lenovo = new Pc(5, "new ", "green ", 4, "lenovo");
                System.out.println(lenovo);
                break;
            case 3:
                Charger Apple = new Charger("red", "Apple", 2019);
                System.out.println(Apple);
                break;
            case 4:
                Hansfari meta = new Hansfari("blue", "meta", 2022, 23);
                System.out.println(meta.toString2());

                break;
            case 5:
                Keyboard keyboard = new Keyboard("black", "dell", 2017, 43);
                System.out.println(keyboard);
                break;
            case 6:
                Laptop laptop = new Laptop("yellow", "lenovo", 2022, 7, "thinkpad", 4);
                System.out.println(laptop);
                break;
            case 7:
                Maos maos = new Maos("black", "tsco", 2013, 90, "good");
                System.out.println(maos);
                break;
            case 8:
                Phone phone = new Phone("pink", "iphon", 2023, 8, 32, 15);

                System.out.println(phone);
                break;
            case 9:
                Tv tv = new Tv("black", "LG", 2022, 58, "perfect", "good");
                System.out.println(tv);
                break;
        }


    }
}
