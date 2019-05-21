/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public abstract class ShareAsset implements Asset {
    int id;
    double totalCost;
    double currentP;
    @Override
    public abstract double getProfit();

    public ShareAsset(int id, double totalCost, double currentP) {
        this.id = id;
        this.totalCost = totalCost;
        this.currentP = currentP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentP() {
        return currentP;
    }

    public void setCurrentP(double currentP) {
        this.currentP = currentP;
    }
    
}

   
