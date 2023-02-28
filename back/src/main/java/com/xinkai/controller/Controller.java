package com.xinkai.controller;

import com.google.gson.Gson;
import com.xinkai.entity.Student;
import com.xinkai.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// 去掉警告
@SuppressWarnings("all")
// 跨域
@CrossOrigin(origins = {"*","null"})
public class Controller {
    @Autowired
    private StudentMapper studentMapper;
    private Gson gson = new Gson();

    // 查询
    @GetMapping("/select")
    public String selectStudents(){
        List<Student> students = studentMapper.selectList(null);
        return gson.toJson(students);
    }

    // 增加
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentMapper.insert(student);
    }

    // 删除
    @PostMapping("/delete")
    public void deleteStudent(@RequestBody Student student){
        studentMapper.deleteById(student);
    }

    // 修改
    @PostMapping("/update")
    public void updateStudent(@RequestBody Student student){
        studentMapper.updateById(student);
    }

}






































