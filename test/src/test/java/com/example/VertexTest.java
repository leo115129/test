package com.example;

import com.example.Vertex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 对Vertex类的calcDistance方法进行测试
 *
 */
public class VertexTest {
    /**
     * 测试计算两个不同顶点的距离。
     */
    @Test
    void testCalcDistance_DifferentVertices() {
        Vertex v1 = new Vertex();
        v1.x = 0;
        v1.y = 0;
        Vertex v2 = new Vertex();
        v2.x = 3;
        v2.y = 0;
        assertEquals(3, v1.calcDistance(v2));
    }

    /**
     * 测试计算顶点与自身的距离
     */
    @Test
    void testCalcDistance_SameVertex() {
        Vertex v1 = new Vertex();
        v1.x = 0;
        v1.y = 0;
        assertEquals(0, v1.calcDistance(v1));
    }

    /**
     * 测试传入null作为参数//
     */
    @Test
    void testCalcDistance_NullParameter() {
        Vertex v1 = new Vertex();
        assertThrows(NullPointerException.class, () -> v1.calcDistance(null));
    }
}
