package com.mta.springBootDemo.Entities.forSqlServer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CategoryCollection")
public record Category(
        @Id
        @Column(name = "_id")
        String _id,
        @Column(name = "CategoryName")
        String categoryName
    ) {
    }
//Category category = new Category(new ObjectId(), "Example Category");