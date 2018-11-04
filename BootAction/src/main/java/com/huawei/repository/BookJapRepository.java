package com.huawei.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huawei.entity.Book;

public interface BookJapRepository extends JpaRepository<Book, String>
{

}
