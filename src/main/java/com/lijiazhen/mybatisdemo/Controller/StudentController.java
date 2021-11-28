package com.lijiazhen.mybatisdemo.Controller;

import com.lijiazhen.mybatisdemo.Service.StudentService;
import com.lijiazhen.mybatisdemo.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/lists")
    public String lists(ModelMap modelMap){
        List<Student> list=studentService.lists();
        modelMap.put("students",list);
        return "list";
    }
    @RequestMapping("/addForm")
    public String addForm(Model model){

        return "add";
    }
    @RequestMapping("/add")
    public String add(Student student){
        System.out.println("add"+student);
        studentService.add(student);
        return "redirect:/lists";
    }

    @RequestMapping("/delete")
    public String delete(Integer studentid){
        studentService.delete(studentid);
        return "redirect:/lists";
    }

    @RequestMapping("/updateForm")
    public String updateForm(Integer studentid,ModelMap modelMap){
        modelMap.put("student",studentService.getById(studentid));

        return "update";
    }

    @RequestMapping("/update")
    public String update(Student student){
        studentService.update(student);
        return "redirect:/lists";
    }

}

