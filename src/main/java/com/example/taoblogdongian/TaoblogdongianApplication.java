package com.example.taoblogdongian;

import com.example.taoblogdongian.service.BlogService;
import com.example.taoblogdongian.service.CategoryService;
import com.example.taoblogdongian.service.impl.BlogServiceImplWithSpringData;
import com.example.taoblogdongian.service.impl.CategoryServiceImplWithSpringData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaoblogdongianApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaoblogdongianApplication.class, args);
    }
    @Bean
    public BlogService customerService(){
        return new BlogServiceImplWithSpringData();
    }
    @Bean
    public CategoryService provinceService() {return  new CategoryServiceImplWithSpringData();}

}
