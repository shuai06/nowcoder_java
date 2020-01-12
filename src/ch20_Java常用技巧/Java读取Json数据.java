package ch20_Java常用技巧;


/*
* JSON   :    js对象描述法

* */


import jdk.nashorn.internal.parser.JSONParser;
import jdk.nashorn.internal.runtime.JSONListAdapter;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Java读取Json数据 {
    public static void main(String[] args) throws FileNotFoundException {
        JSONListAdapter parser = new JSONParser();  // 解析器
        JsonObject object = (JsonObject) parser.parse(new FileReader("test,json"));  //
        System.out.println(object.get("cat").getAsString());
        System.out.println(object.get("cat").getAsBoolean());

        JsonArray array = object.get("language").getJsonArray();    // json array
        for(int i=0; i<array.size(); i++){
            JsonObject subObject = array.get(i).getJsonObject();
            System.out.println(subObject.get("id").getAsInt());
        }


    }
}
























