import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReflectionDemo {
    public static <T> int getClass(List<T> list){
        return (int) list.stream().filter(n->n instanceof Human).count();
    }
    public static <T> List<String> getNamesOfMethods(T obj){
        return Arrays.stream(obj.getClass().getDeclaredMethods()).map(Method::getName).toList();
    }
    public static <T> List<String> getSuperClasses(T obj){
        List<String> list = new ArrayList<String>();
        var class_ = obj.getClass();
        while(class_!=null){
            list.add(class_.getName());
            class_ = class_.getSuperclass();
        }
        return list;
    }
}
