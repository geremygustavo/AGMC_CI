package org.seedstack.samples.store.interfaces.rest.product;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductsResourceTest {
    ProductsResource p;


    @Before
    public void before() {
        p = new ProductsResource();
    }

    @Test
    public void test1() {
        assertEquals(null, p.getProduct(1));
    }
}