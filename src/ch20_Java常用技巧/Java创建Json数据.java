package ch20_Java常用技巧;

public class Java创建Json数据 {
    public static void main(String[] args) {
        JsonObject object = new JsonObject();
        object.addProperty("cat", "it");

        //
        JsonArray arr = new JsonArray();
        JsonObject lan1 = new JsonObject();
        lan1.addProperty("id",1);
        lan1.addProperty("name","java");
        lan1.addProperty("idea","IDEA");

        arr.addl(lan1);

        object.add("language", arr);

        System.out.println(object.toString());
    }
}
