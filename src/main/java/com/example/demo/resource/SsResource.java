package com.example.demo.resource;

import com.example.demo.domain.Task;
import com.example.demo.service.TaskService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class SsResource {

    private TaskService taskService;

    public SsResource(TaskService taskService){
        this.taskService=taskService;
    }

	@RequestMapping(value = "/roles",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public Set getAllRoles() {
        return new HashSet<>(Arrays.asList("Hehe", "Huhu"));
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Task> getAllTasks(){
	    return taskService.getAllTasks();
    }
}
