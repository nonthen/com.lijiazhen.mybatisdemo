package com.lijiazhen.mybatisdemo.Service;

import com.lijiazhen.mybatisdemo.Mapper.StudentMapper;
import com.lijiazhen.mybatisdemo.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> lists(){
        return studentMapper.lists();
    }

    public void add(Student student){
        studentMapper.add(student);
    }

    public void delete(Integer studentid){
        studentMapper.delete(studentid);
    }

    public void update(Student student){
        studentMapper.update(student);
    }
    public Student getById(Integer studentid){
        return studentMapper.getByID(studentid);
    }
}
