/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Apo
 */
public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot() {
        
    }
    
    public BulkTank getBulkTank() {
        if(tank == null) {
            return null;
        }
        
        return tank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) {
        try {
            tank.addToTank(milkable.milk());
        }
        catch(Exception e) {
            System.out.println("The MilkingRobot hasn't been installed");
        }
    }
}
