package me.dulanjana.demo.repo;

import me.dulanjana.demo.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDataRepo extends JpaRepository<ImageData,Integer> {
}
