package Concurency_Multithreading.Java8.CompletableFuture.Example.service;


import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.Product;
import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.ProductInfo;
import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.Review;

import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.LoggerUtil.log;
import static  Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.stopWatch;

public class ProductService {
    private ProductInfoService productInfoService;
    private ReviewService reviewService;

    public ProductService(ProductInfoService productInfoService, ReviewService reviewService) {
        this.productInfoService = productInfoService;
        this.reviewService = reviewService;
    }

    public Product retrieveProductDetails(String productId) {
        stopWatch.start();

        ProductInfo productInfo = productInfoService.retrieveProductInfo(productId); // blocking call
        Review review = reviewService.retrieveReviews(productId); // blocking call

        stopWatch.stop();
        log("Total Time Taken : "+ stopWatch.getTime());
        return new Product(productId, productInfo, review);
    }

    public static void main(String[] args) {

        ProductInfoService productInfoService = new ProductInfoService();
        ReviewService reviewService = new ReviewService();
        ProductService productService = new ProductService(productInfoService, reviewService);
        String productId = "ABC123";
        Product product = productService.retrieveProductDetails(productId);
        log("Product is " + product);

    }
}
