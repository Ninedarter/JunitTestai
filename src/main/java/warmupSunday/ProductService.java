package warmupSunday;

public class ProductService {

    /**
     * Sukurti metoda,kuris paskaiciuotu bendra visu produktu esanciu masyve kaina
     */


    public Double calculateTotalProductsPrice(Product[] products) {
        double total = 0.0;
        for (Product singleProduct : products) {
            if (singleProduct.price > 0 && singleProduct.quantity > 0){
                total += singleProduct.price * singleProduct.quantity;
            }

        }
        return total;
    }

}

