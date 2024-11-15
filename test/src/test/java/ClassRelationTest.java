import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * 对类关系进行测试
 *
 */
public class ClassRelationTest {
    /**
     * 检查Triangle实现Polygon接口
     */
    @Test
    void testTriangleImplementsPolygon() {
        Class<Triangle> triangleClass = Triangle.class;
        Class<Polygon> polygonClass = Polygon.class;
        assertTrue(polygonClass.isAssignableFrom(triangleClass));
        try {
            Method[] polygonMethods = polygonClass.getMethods();
            for (Method method : polygonMethods) {
                assertTrue(triangleClass.getMethod(method.getName(), method.getParameterTypes())!= null);
            }
        } catch (NoSuchMethodException e) {
            fail(e);
        }
    }

    /**
     * 检查Rectangle实现Polygon接口
     */
    @Test
    void testRectangleImplementsPolygon() {
        Class<Rectangle> rectangleClass = Rectangle.class;
        Class<Polygon> polygonClass = Polygon.class;
        assertTrue(polygonClass.isAssignableFrom(rectangleClass));
        try {
            Method[] polygonMethods = polygonClass.getMethods();
            for (Method method : polygonMethods) {
                assertTrue(rectangleClass.getMethod(method.getName(), method.getParameterTypes())!= null);
            }
        } catch (NoSuchMethodException e) {
            fail(e);
        }
    }

    /**
     * 检查AdapterCircle实现Polygon接口
     */
    @Test
    void testAdapterCircleImplementsPolygon() {
        Class<AdapterCircle> adapterCircleClass = AdapterCircle.class;
        Class<Polygon> polygonClass = Polygon.class;
        assertTrue(polygonClass.isAssignableFrom(adapterCircleClass));
        try {
            Method[] polygonMethods = polygonClass.getMethods();
            for (Method method : polygonMethods) {
                assertTrue(adapterCircleClass.getMethod(method.getName(), method.getParameterTypes())!= null);
            }
        } catch (NoSuchMethodException e) {
            fail(e);
        }
    }

    /**
     * 检查AdapterCircle对Circle的适配
     */
    @Test
    void testAdapterCircleAdaptsCircle() {
        AdapterCircle adapterCircle = new AdapterCircle(new Circle());
        // 检查draw方法是否调用Circle的drawCircle方法（这里假设简单检查方法调用关系）
        assertTrue(adapterCircle.draw() != false);
    }
}
