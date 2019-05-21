/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class DividendStock extends Stock{
    int dividens;

    public DividendStock(int dividens, int totalS, int id, double totalCost, double currentP) {
        super(totalS, id, totalCost, currentP);
        this.dividens = dividens;
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
        v=((totalS*currentP)+ dividens);
        return v;
    }
    
    
}
