/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class MutualFund extends ShareAsset {
    double totalS;

    public MutualFund(double totalS, int id, double totalCost, double currentP) {
        super(id, totalCost, currentP);
        this.totalS = totalS;
    }
     @Override
    public double getProfit(){
        double p;
        p=((totalS*currentP)-(totalCost));
        return p;
    }
    @Override
    public double getMarketValue(){
        double v;
        v=(totalS*currentP);
        return v;
    }
    
}
