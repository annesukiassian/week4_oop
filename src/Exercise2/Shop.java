package Exercise2;

import Exercise2.Menu;

public class Shop {
    String name;
    String address;
    int countOfProduct;
    double priceOfProduct;
    double shopBalance;


    public Shop(String name, String address, int countOfProduct, double priceOfProduct, double shopBalance) {
        this.name = name;
        this.address = address;
        this.priceOfProduct = priceOfProduct;
        this.countOfProduct = countOfProduct;
        this.shopBalance = shopBalance;
    }

    public boolean checkOrder(int countOfOrder) {
        if (countOfOrder <= countOfProduct) {
            return true;
        }
        return false;
    }

    void wantToBuy(int countOfOrder) {
        if (checkOrder(countOfOrder)) {
            System.out.println("if you want to buy it, Please press 1 , if you don’t want to buy it press any bottom");
            Menu menu = new Menu();
            if (menu.ch == '1') {
                shopBalance += (countOfOrder);
            }
        }
    }

    public double calculateOrder(int countOfOrder) {
        return countOfOrder * priceOfProduct;
    }
}
