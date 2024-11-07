package com.example.CourseProjectSUBD.service;

import com.example.CourseProjectSUBD.exception.ResourceNotFoundException;
import com.example.CourseProjectSUBD.entity.Parents;
import org.springframework.stereotype.Service;
import com.example.CourseProjectSUBD.repository.ParentsRepository;


import java.util.List;

@Service
public class ParentsService {

    public ParentsRepository parentsRepository;

    public ParentsService(ParentsRepository parentsRepository) {

        this.parentsRepository = parentsRepository;
    }

    public Parents saveParents(Parents parents) {

        return parentsRepository.save(parents);
    }

    public List<Parents> getAllParents() {

        return parentsRepository.findAll();
    }

    public Parents getParentsById(Integer id) {
        return parentsRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Parent", "Id", id));
    }

    public Parents updateParents(Parents parents, Integer id) {

        Parents existingParent = parentsRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Parent", "Id", id)
        );
        existingParent.setFirstName(parents.getFirstName());
        existingParent.setLastName(parents.getLastName());
        existingParent.setEmail(parents.getEmail());
        parentsRepository.save(existingParent);
        return existingParent;

    }

    public void deleteParents(Integer id) {
        parentsRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Parent", "Id", id));

        parentsRepository.deleteById(id);
    }
}
