package com.egiantsprojects.practice.mocktio.service;

import com.egiantsprojects.practice.mocktio.model.Course;
import com.egiantsprojects.practice.mocktio.model.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {

    @InjectMocks
    StudentService studentService;

    @Mock
    Student student;

    public void testData() {

    }
    @Test
    public void retrieveAllStudents() {
    }

    @Test
    public void retrieveStudent() {
    }

    @Test
    public void retrieveCourses() {
    }

    @Test
    public void retrieveCourse() {
    }

    @Test
    public void addCourse() {

        List<Course> courseList = new ArrayList<>();
        Course course = new Course();
        course.setId("12345");
        courseList.add(course);
        student.setId("Student1");
        student.setName("Raj");
        student.setCourses(courseList);
        student.setDescription("Good Buddy");

       Course courseReturned = studentService.addCourse("Student1",course);

        Assert.assertNotEquals("12345",courseReturned.getId());
    }
}
