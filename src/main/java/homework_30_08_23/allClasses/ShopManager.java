package homework_30_08_23.allClasses;

import homework_30_08_23.allEnums.Currency;
import homework_30_08_23.allEnums.ProductCategory;

import java.util.Arrays;

public class ShopManager {

    static Product[] products = {
            new Product(1, "Dress", ProductCategory.WOMEN_CLOTHES, 25.00, Currency.EUR),
            new Product(2, "Skirt", ProductCategory.WOMEN_CLOTHES, 15.00, Currency.EUR),
            new Product(3, "Trousers", ProductCategory.MENSWEAR, 18.50, Currency.EUR),
            new Product(4, "Blouse", ProductCategory.TEEN_CLOTHES, 13.50, Currency.EUR),
            new Product(5, "T-Shirt", ProductCategory.CHILDREN_CLOTHES, 4.00, Currency.EUR)
    };

    public void run() {
        addProduct(new Product(6, "Jacket", ProductCategory.MENSWEAR, 45.00, Currency.EUR));
        getProductsByCategory(ProductCategory.TEEN_CLOTHES);
        getProductsByPriceRange(10, 15, Currency.EUR);
    }

    private void addProduct(Product product) { //для добавления товара в список

        Product[] addInProducts = new Product[10];

        System.out.println("Первый список товаров: " + Arrays.toString(products));

        System.arraycopy(products, 0, addInProducts, 0, products.length);
        addInProducts[products.length] = product;
        System.out.println("Список товаров после добавления нового товара: " + Arrays.toString(addInProducts));
    }

    private void getProductsByCategory(ProductCategory cat) {//для получения списка товаров по заданной категории

        for (Product pr : products) {
            if (pr.getCategory().equals(cat))
                System.out.println("Товары из указанной категории с ценой: " + pr.getName() + ", " + pr.getPrice() + ", " + pr.getCurrency());
        }
        return;
    }

    private void getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        //для получения списка товаров в заданном диапазоне цен и в указанной валюте.

        for (Product i : products) {
            if (i.getPrice() >= minPrice && i.getPrice() <= maxPrice && i.getCurrency() == currency)
                System.out.println("Товары в заданном диапазоне цен: " + i.getName());
        }
        return;
    }
}








