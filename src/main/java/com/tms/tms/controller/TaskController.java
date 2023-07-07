package com.tms.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.tms.model.Task;
import com.tms.tms.repository.TaskRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/tasks")
public class TaskController {
    


    @Autowired
    private TaskRepository taskRepository;



    // adding a task
    @PostMapping("/add")
    public void addATask(@RequestBody Task task){
        taskRepository.save(task);
    }

    //getting all tasks

    @GetMapping("/all")
    public List<Task> getAllTasks(){
      return  taskRepository.findAll();
    }


    //update a task
     @PutMapping("/update")
     public void updateATask(@RequestBody Task task){
        taskRepository.save(task);
    }


    //delete a task
    @DeleteMapping("/delete/{id}")
    public void deleteATask(@PathVariable Long id){
           taskRepository.deleteById(id);
    }

}
