import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 对Circle类的calcAreaCircle方法进行测试
 *
 */
public class CircleTest {
    /**
     * 测试计算正数半径圆的面积
     */
    @Test
    void testCalcAreaCircle_PositiveRadius() {
        Circle circle = new Circle();
        circle.radius = 5;
        assertEquals((float) (Math.PI * 5 * 5), circle.calcAreaCircle());
    }

    /**
     * 测试计算半径为0的圆的面积
     */
    @Test
    void testCalcAreaCircle_ZeroRadius() {
        Circle circle = new Circle();
        circle.radius = 0;
        assertEquals(0, circle.calcAreaCircle());
    }

    /**
     * 测试计算负数半径圆的面积
     */
    @Test
    void testCalcAreaCircle_NegativeRadius() {
        Circle circle = new Circle();
        circle.radius = -3;
        // 根据实际处理方式选择断言
        // 若抛出异常
        //assertThrows(IllegalArgumentException.class, () -> circle.calcAreaCircle());
        // 若返回0或其他合理值
        assertEquals(0, circle.calcAreaCircle());
    }
}
