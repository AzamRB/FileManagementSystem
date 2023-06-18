package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long>{
	
	Optional<FileEntity> findById(Long id);

}
