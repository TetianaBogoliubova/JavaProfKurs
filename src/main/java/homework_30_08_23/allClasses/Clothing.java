package homework_30_08_23.allClasses;
//2.2. Clothing - Подкласс класса Product для представления одежды:
//  Дополнительное поле size (размер одежды из Size).
//  Конструктор для инициализации полей.

import homework_30_08_23.allEnums.Currency;
import homework_30_08_23.allEnums.ProductCategory;
import homework_30_08_23.allEnums.Size;

public class Clothing {

    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Clothing(int id, String name, ProductCategory category, double price, Currency currency, Size size) {
        //super(id, name, category, price, currency);
        this.size = size;
    }
}
