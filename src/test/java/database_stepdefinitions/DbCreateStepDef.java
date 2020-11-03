package database_stepdefinitions;
import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbCreateStepDef {
    @Given("kullanici yeni bir hotel olusturur")
    public void kullanici_yeni_bir_hotel_olusturur() throws SQLException {
        String query = "INSERT INTO dbo.tHOTEL (Code, Name, Address, Phone, Email, IDGroup, CreateDate, CreateUser) " +
        "VALUES ('113', 'ONUR YINEO :)', 'Cikmaz SK.','012345', 'batch5@gmail.com', 1132020, '2020-11-03 00:00:00.000', 4)";
        DBUtils.executeQuery(query);

        }

}
