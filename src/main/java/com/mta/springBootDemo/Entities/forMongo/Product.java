package com.mta.springBootDemo.Entities.forMongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ProductCollection")
public record Product(
        @Id
        @Field(name = "_id")
        String id,

        @Field(name = "ProductName")
        String productName,

        @Field(name = "CategoryId")
        String categoryId,

        String categoryName
    ) {

    }