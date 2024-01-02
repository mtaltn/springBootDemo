package com.mta.springBootDemo.Entities.forSqlServer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCollection")
public record Product(
        @Id
        @Column(name = "_id")
        String _id,
        @Column(name = "ProductName")
        String productName,
        @Column(name = "CategoryId")
        String categoryId,
        String categoryName
    ) {
    }