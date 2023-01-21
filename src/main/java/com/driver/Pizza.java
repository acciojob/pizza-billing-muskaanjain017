package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int addExtraTopping;
    private boolean isExtraCheese;
    private boolean isExtraTopping;
    private boolean isTakeAway;
    private boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.addExtraTopping = 70;
        }
        else{
            this.price = 400;
            this.addExtraTopping = 120;
        }
        isExtraCheese = false;
        isExtraTopping = false;
        isTakeAway = false;
        isBillGenerated = false;
        this.bill = "";
        this.bill+= "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price += 80;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopping){
            this.price += addExtraTopping;
            isExtraTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isExtraCheese){
                this.bill = "Extra Cheese Added: 80\n";
            }
            if(isExtraTopping){
                this.bill ="Extra Toppings Added: "+addExtraTopping+"\n";
            }
            if(isTakeAway){
                this.bill ="Paperbag Added: 20\n";
            }
            this.bill = "Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
