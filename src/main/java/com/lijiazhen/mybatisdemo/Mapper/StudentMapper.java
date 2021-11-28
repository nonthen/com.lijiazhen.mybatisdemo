package com.lijiazhen.mybatisdemo.Mapper;

import java.util.List;

import com.lijiazhen.mybatisdemo.po.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> lists();

    @Insert("insert into student values(#{student.studentid},#{student.studentname},#{student.studentage},#{student.studentgender})")
    void add(@Param("student") Student student);

    @Delete("delete from student where studentid=#{studentid}")
    void delete(@Param("studentid") Integer studentid);

    @Update("update student set studentname=#{student.studentname},studentage=#{student.studentage},studentgender=#{student.studentgender} where studentid=#{student.studentid}")
    void update(@Param("student") Student student);

    @Select("select * from student where studentid=#{studentid}")
    Student getByID(@Param("studentid") Integer studentid);

}