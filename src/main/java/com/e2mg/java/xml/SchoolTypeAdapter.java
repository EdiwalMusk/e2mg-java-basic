package com.e2mg.java.xml;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.w3c.dom.Node;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class SchoolTypeAdapter extends XmlAdapter<Object, JSONObject> {

    @Override
    public JSONObject unmarshal(Object v) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        StreamResult result = new StreamResult(new StringWriter());
        transformer.transform(new DOMSource((Node) v), result);
        return new XmlMapper().readValue(result.getWriter().toString(), JSONObject.class);
    }

    @Override
    public Object marshal(JSONObject v) throws Exception {
        return null;
    }
}
