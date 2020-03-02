package com.example.Mybatis;

import org.apache.ibatis.annotations.Mapper;
import com.example.Mybatis.Note;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoteRepository {
    @Select("select * from NOTE")
    public List< Note > findAll();
}
