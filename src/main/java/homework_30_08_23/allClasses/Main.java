package homework_30_08_23.allClasses;

import homework_30_08_23.allEnums.Currency;
import homework_30_08_23.allEnums.ProductCategory;

public class Main {
    public static void main(String[] args) {

        ShopManager sm = new ShopManager();

        //sm.addProduct (new Product(6, "Jacket", ProductCategory.MENSWEAR, 45.00, Currency.EUR));
        sm.run();
        sm.getProductsByCategory(ProductCategory.WOMEN_CLOTHES);
        sm.getProductsByPriceRange(10, 20, Currency.EUR);
    }
}






