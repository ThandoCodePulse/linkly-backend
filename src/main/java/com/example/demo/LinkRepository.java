package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List; 

@Repository
public interface LinkRepository extends JpaRepository<Link,Long>{
    
}
