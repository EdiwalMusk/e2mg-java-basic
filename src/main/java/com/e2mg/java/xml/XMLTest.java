package com.e2mg.java.xml;

import com.alibaba.fastjson.JSONObject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;

/**
 * xml动态读取
 */
public class XMLTest {
    public static void main(String[] args) throws IOException, JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Person person = (Person) unmarshaller.unmarshal(ClassLoader.getSystemResourceAsStream("test.xml"));
        System.out.println(JSONObject.toJSONString(person));
    }
}
