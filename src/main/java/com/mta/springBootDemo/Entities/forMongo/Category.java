package com.mta.springBootDemo.Entities.forMongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "CategoryCollection")
public record Category(
        @Id
        @Field(name = "_id")
        String id,

        @Field(name = "CategoryName")
        String categoryName
    ) {

    }


