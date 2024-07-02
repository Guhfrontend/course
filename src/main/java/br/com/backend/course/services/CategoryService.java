package br.com.backend.course.services;

import br.com.backend.course.entites.Category;
import br.com.backend.course.repositores.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return  repository.findAll();
    }

    public Category findById(Integer id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
