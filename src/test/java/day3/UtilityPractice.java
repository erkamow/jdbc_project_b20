package day3;

import utility.DB_Utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilityPractice {

    public static void main(String[] args) throws SQLException {

        DB_Utility.createConnection();

       ResultSet jobRS = DB_Utility.runQuery("SELECT * FROM JOBS");

        /**
         * get the row count of the ResultSet
         * move the pointer to the last row and get the row number
         */

        jobRS.last();
        int rowCount = DB_Utility.getRowCount();
        System.out.println("rowCount = "+rowCount);

        int colCount = DB_Utility.getColumnCount();
        System.out.println("colCount = "+colCount);

        System.out.println("All column names = "+ DB_Utility.getColumnNames());

        System.out.println("Row data at row 3 = "+DB_Utility.getRowDataAsList(3));

        System.out.println("Row number = 3 "+"Column Number = 4 -->"+DB_Utility.getColumnDataAtRow(3,4));

        System.out.println("Row number = 3 "+"Column name = MAX_SALARY--> "+DB_Utility.getColumnDataAtRow(3,"MIN_SALARY"));

        System.out.println("Column number = 3 --> "+DB_Utility.getColumnDataAsList(3));

        System.out.println("Column name = job title --> "+DB_Utility.getColumnDataAsList("JOB_TITLE"));

        System.out.println("-----\n");
        DB_Utility.displayAllData();

        System.out.println("-------------------------------MAPS------------------------");


        System.out.println("Row number = 3 --->"+DB_Utility.getRowMap(3));


     System.out.println("all data = \n "+DB_Utility.getAllDataAsListOfMap());






        DB_Utility.destroy();

    }
}
