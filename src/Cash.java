/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jssuarezse
 */
public class Cash implements Asset {
    public double amount;
    @Override
    public double getMarketValue(){
    return amount;
}    @Override
    public double getProfit(){
    return 0;
}
    
}
