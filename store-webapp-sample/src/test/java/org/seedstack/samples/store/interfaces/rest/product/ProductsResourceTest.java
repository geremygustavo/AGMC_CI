package org.seedstack.samples.store.interfaces.rest.product;

import org.junit.Before;
import org.junit.Test;

public class ProductsResourceTest {
    ProductsResource p;
    ProductRepresentation prod = new ProductRepresentation();

    @Before
    public void before() {
        p = new ProductsResource();
    }

    @Test(expected = NullPointerException.class)
    public void test1() {
        p.getProduct(12345678910L);
    }

    @Test(expected = NullPointerException.class)
    public void test2() {
        p.getProduct(232L);
    }
}