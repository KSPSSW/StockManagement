/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package material;

/**
 *
 * @author kissa
 */
public class Material {
    private String name;
    private int originalQuantity;
    private int remainingQuantity;
    
    public Material(String name, int originalQuantity, int remainingQuantity){
        this.name = name;
        this.originalQuantity = originalQuantity;
        this.remainingQuantity = remainingQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOriginalQuantity() {
        return originalQuantity;
    }

    public void setOriginalQuantity(int originalQuantity) {
        this.originalQuantity = originalQuantity;
    }

    public int getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(int remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }
    
}
