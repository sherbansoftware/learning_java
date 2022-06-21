package Concurency_Multithreading.Java5.Executor_Service.Example;


import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.Product;
import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.ProductInfo;
import Concurency_Multithreading.Java8.CompletableFuture.Example.domain.Review;
import Concurency_Multithreading.Java8.CompletableFuture.Example.service.ProductInfoService;
import Concurency_Multithreading.Java8.CompletableFuture.Example.service.ReviewService;

import java.util.concurrent.*;

import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.CommonUtil.stopWatch;
import static Concurency_Multithreading.Java8.CompletableFuture.Example.util.LoggerUtil.log;

public class ProductServiceUsingExecutor {

    static ExecutorService executorService= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    private ProductInfoService productInfoService;
    private ReviewService reviewService;

    public ProductServiceUsingExecutor(ProductInfoService productInfoService, ReviewService reviewService) {
        this.productInfoService = productInfoService;
        this.reviewService = reviewService;
    }

    public Product retrieveProductDetails(String productId) throws ExecutionException, InterruptedException, TimeoutException {
        stopWatch.start();

        Future<ProductInfo> productInfoFuture = executorService.submit(()->productInfoService.retrieveProductInfo(productId));
        Future<Review> reviewFuture = executorService.submit(()->reviewService.retrieveReviews(productId));

        //ProductInfo productInfo = productInfoFuture.get();
        ProductInfo productInfo = productInfoFuture.get(2, TimeUnit.SECONDS);
        Review  review = reviewFuture.get();

        stopWatch.stop();
        log("Total Time Taken : "+ stopWatch.getTime());
        return new Product(productId, productInfo, review);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ProductInfoService productInfoService = new ProductInfoService();
        ReviewService reviewService = new ReviewService();
        ProductServiceUsingExecutor productService = new ProductServiceUsingExecutor(productInfoService, reviewService);
        String productId = "ABC123";
        Product product = productService.retrieveProductDetails(productId);
        log("Product is " + product);
        executorService.shutdown();

    }
}
