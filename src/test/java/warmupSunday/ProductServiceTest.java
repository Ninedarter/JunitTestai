package warmupSunday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void calculateTotalProductsPrice() {

//given..
        //given - duotieji duomenys testui
        Product product1 = new Product("Bread", 1.24, 3);
        Product product2 = new Product("Milk", 2.05, 1);
        Product product3 = new Product("Bread", 3.1, 5);
        Product[] products = {product1,product2,product3};
        ProductService productService = new ProductService();
        //When - veiksmas ,kuri testuotu ir jo rezultato.

        double actualProductsTotal = productService.calculateTotalProductsPrice(products);
        // then - rezultatas kokiu tikemis  ir ka gaunam naudodami metoda
        assertEquals(21.27,actualProductsTotal);
    }

    @Test
    void calculateTotalProductsPrice_WhenPriceOrQuantityNegative() {

        //given
        Product product1 = new Product("Bread", -1.0, 3);
        Product product2 = new Product("Milk", 2.05, -1);
        Product product3 = new Product("Bread", 3.0, 5);
        Product[] products = {product1,product2,product3};
        ProductService productService = new ProductService();
        //When

        double actualProductsTotal = productService.calculateTotalProductsPrice(products);


        // then
        assertEquals(15.0,actualProductsTotal);

    }
}