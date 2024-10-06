package material;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kissa
 */
import java.util.ArrayList;
import java.util.Date;

public class StockCheck {
    private Date checkDate;
    private String checkedBy;

    public StockCheck(Date checkDate, String checkedBy, ArrayList<Material> check2Materials) {
        this.checkDate = checkDate;
        this.checkedBy = checkedBy;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public String getCheckedBy() {
        return checkedBy;
    }

    public Iterable<Material> getCheckedMaterials() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
