package com.huawei.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huawei.entity.Book2;

public interface ReadingListRepository extends JpaRepository<Book2, Long>
{
	List<Book2> findByReader(String reader);
}
