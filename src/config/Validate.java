package config;

public class Validate {
    public static boolean checkProductName(String productName){
        if(productName.length() <= 6 || !productName.startsWith("P")) {
            return false;
        }
        return true;
    }

    public static boolean checkProductPrice(Double price){
        if(price <= 0) {
            return false;
        }
        return true;
    }
}
