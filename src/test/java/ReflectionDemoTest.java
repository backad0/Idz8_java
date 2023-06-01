import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReflectionDemoTest {

    @Test
    public void testGetClass() {
        var list = new ArrayList<>() {{
            add(new Human());
            add(new Human());
            add("123");
            add(123);
            add(new Human("1", "1", "1", 1));
        }};
        assertEquals(3, ReflectionDemo.getClass(list));
    }

    @Test
    public void getNamesOfMethods() {
        assertEquals(141, ReflectionDemo.getNamesOfMethods("").size());
        assertEquals(32, ReflectionDemo.getNamesOfMethods(1.).size());
        assertEquals(10, ReflectionDemo.getNamesOfMethods(new Human()).size());
    }

    @Test
    public void getSuperClasses() {
        var lHuman = new ArrayList<String>() {{
            add("Human");
            add("java.lang.Object");
        }};
        assertEquals(lHuman, ReflectionDemo.getSuperClasses(new Human()));
    }

    @Test
    public void getSuperClassesTest() {
        var lStudent = new ArrayList<String>() {{
            add("Student");
            add("Human");
            add("java.lang.Object");
        }};
        assertEquals(lStudent, ReflectionDemo.getSuperClasses(new Student()));
    }
}
