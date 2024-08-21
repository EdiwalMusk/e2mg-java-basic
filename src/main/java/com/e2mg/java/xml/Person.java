package com.e2mg.java.xml;

import com.alibaba.fastjson.JSONObject;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "person")
public class Person {

    private String name;

    private int age;

    @XmlJavaTypeAdapter(value = SchoolTypeAdapter.class, type = JSONObject.class)
    private JSONObject school;
}
