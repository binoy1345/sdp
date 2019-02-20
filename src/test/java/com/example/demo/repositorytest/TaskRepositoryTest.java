package com.example.demo.repositorytest;

import com.example.demo.domain.Task;
import com.example.demo.repository.TaskRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.TestComponent;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;

@TestComponent
public class TaskRepositoryTest {

    @Mock
    TaskRepository taskRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void taskTest(){
        Task task1=new Task();
        task1.setDesc("TestDesc1");
        task1.setTargetDate(new Date());
        task1.setDone(true);
        when(taskRepository.findAll()).thenReturn(Arrays.asList(task1));
        List<Task> tasks=taskRepository.findAll();
        Assert.assertTrue(tasks.size()==1);
    }
}
