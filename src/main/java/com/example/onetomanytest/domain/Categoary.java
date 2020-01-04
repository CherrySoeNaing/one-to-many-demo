package com.example.onetomanytest.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    Private String name;



}
