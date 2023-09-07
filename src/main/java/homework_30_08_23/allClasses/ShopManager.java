package homework_30_08_23.allClasses;

import homework_30_08_23.allEnums.Currency;
import homework_30_08_23.allEnums.ProductCategory;

import java.util.Arrays;

public class ShopManager {
    public Product[] products = new Product[5];

    public void run() {
        addProduct(new Product(6, "Jacket", ProductCategory.MENSWEAR, 45.00, Currency.EUR));
        //getProductsByCategory(ProductCategory.WOMEN_CLOTHES);
        //getProductsByPriceRange(10, 20, Currency.EUR);
    }

    private void addProduct(Product product) { //для добавления товара в список

        Product[] products = new Product[5];
        products[0] = new Product(1, "Dress", ProductCategory.WOMEN_CLOTHES, 25.00, Currency.EUR);
        products[1] = new Product(2, "Skirt", ProductCategory.WOMEN_CLOTHES, 15.00, Currency.EUR);
        products[2] = new Product(3, "Trousers", ProductCategory.MENSWEAR, 18.50, Currency.EUR);
        products[3] = new Product(4, "Blouse", ProductCategory.TEEN_CLOTHES, 13.50, Currency.EUR);
        products[4] = new Product(5, "T-Shirt", ProductCategory.CHILDREN_CLOTHES, 4.00, Currency.EUR);

        Product[] addInProducts = new Product[10];

        System.out.println("Первый список товаров: " + Arrays.toString(products));

        System.arraycopy(products, 0, addInProducts, 0, products.length);
        addInProducts[products.length] = product;
        System.out.println("Список товаров после добавления нового товара: " + Arrays.toString(addInProducts));
    }

    public void getProductsByCategory(ProductCategory category) {//для получения списка товаров по заданной категории

        for (Product i : products) {
            if (i.getCategory() == category) ;
            System.out.println("Товары из указанной категории: " + i.getName() + i.getPrice() + i.getCurrency());
        }


        // или второе решение в этом методе:
//        for(Product i :products) {
//        if (i.getCategory().equals(category);
//            System.out.println("Товары из указанной категории: " + i);
//        }
    }


    public void getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
        //для получения списка товаров в заданном диапазоне цен и в указанной валюте.

        for (Product i : products) {
            if (i.getPrice() >= minPrice && i.getPrice() <= maxPrice && i.getCurrency() == currency)
                System.out.println("Товары в заданном диапазоне цен: " + i.getName());
        }

        //или второе решение в этом методе:

//        List<Product> newProducts = new ArrayList<>();
//        for (int i = 0; i < products.length; i++) {
//            Product prod = products[i];
//
//            if (prod.getPrice() >= minPrice
//                    && prod.getPrice() <= maxPrice
//                    && prod.getCurrency() == currency) {
//                newProducts.add(prod);
//            }
//        }
//        for (Product newProduct : newProducts) {
//            System.out.println(newProduct.getName() + newProduct.getPrice() + newProduct);
//        }
    }
}








