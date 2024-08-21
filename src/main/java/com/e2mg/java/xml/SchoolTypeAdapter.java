package com.e2mg.java.xml;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class SchoolTypeAdapter extends XmlAdapter<Object, JSONObject> {

    @Override
    public JSONObject unmarshal(Object v) throws Exception {
        ElementNSImpl ns = (ElementNSImpl) v;
        String vv = new ObjectMapper().writeValueAsString(ns);
        return new XmlMapper().readValue(vv, JSONObject.class);
    }

    @Override
    public Object marshal(JSONObject v) throws Exception {
        return null;
    }
}
