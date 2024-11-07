package com.example.CourseProjectSUBD.controller;

import com.example.CourseProjectSUBD.service.ParentsService;
import com.example.CourseProjectSUBD.entity.Parents;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000/"})
@RestController
@RequestMapping("/api/parents")
public class ParentsController {
    private final ParentsService parentsService;

    public ParentsController(ParentsService parentsService) {
        this.parentsService = parentsService;
    }

    @PostMapping("/save")
    public ResponseEntity<Parents> saveParents(@RequestBody Parents parents) {
        return new ResponseEntity<>(parentsService.saveParents(parents), HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public List<Parents> getAllParents() {
        return parentsService.getAllParents();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Parents> getParentsById(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(parentsService.getParentsById(id), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Parents> updateParents(@PathVariable("id") Integer id, @RequestBody Parents parents) {
        return new ResponseEntity<>(parentsService.updateParents(parents, id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteParents(@PathVariable("id") Integer id) {
        parentsService.deleteParents(id);
        return new ResponseEntity<>("Parent deleted successfully!.", HttpStatus.OK);
    }
}
