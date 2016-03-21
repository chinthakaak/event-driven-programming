package com.examples;

import java.util.HashMap;
import java.util.TreeMap;

interface GenericEvent {
    public abstract void eventMethod();
}

class TestEvent implements GenericEvent {

    public void eventMethod() {
        System.out.println("invoking test event");
    }
}

class EventListener {

}

class EventSource {

}
public class Callback {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("k1","v1");

        Object oh = hm.get("k1");

//        TreeMap<String, Object> tm = new TreeMap<String, Object>();
//        tm.put("k1","v1");
//        Object ot = tm.get("k1");

        StringBuffer sb = (StringBuffer)oh;
//        String s = (String)ot;



//        String s="test";
//        System.out.println(s);
//        Object o = s.intern();
//        StringBuffer sb = (StringBuffer) o ;

//        String s = (String) o;
//        StringBuffer sb = (StringBuffer) o ;

    }
}
