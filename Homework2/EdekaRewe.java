package Homework2;

public class EdekaRewe {
    boolean isEdekaOpen = true;
    boolean isReweOpen = false;

    public boolean canBuy() {
        return isEdekaOpen || isReweOpen;

    }

    public static void main(String[] args) {
        EdekaRewe shopping = new EdekaRewe();
        boolean canBuy = shopping.canBuy();
        String iCan = "Я могу купить еду, это " + (canBuy ? "возможно" : "невозможно");
        System.out.println(iCan);
    }
}
