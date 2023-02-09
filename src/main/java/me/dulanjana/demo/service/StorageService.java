package me.dulanjana.demo.service;

import com.sun.imageio.plugins.common.ImageUtil;
import me.dulanjana.demo.entity.ImageData;
import me.dulanjana.demo.repo.ImageDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService {

    @Autowired
    private ImageDataRepo imageDataRepo;

}
