package com.espere.car.service;


import com.espere.car.repository.ImageRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@AllArgsConstructor
@Service
public class ImageService {

    private ImageRepository imageRepository;

    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }

    public Image getImageById(Long id) {
        return (Image) imageRepository.findById(id).orElse(null);
    }

    public Image saveImage(Image image) {
        return (Image) imageRepository.save(image);
    }

    public void deleteImage(Long id) {
        imageRepository.deleteById(id);
    }
}
