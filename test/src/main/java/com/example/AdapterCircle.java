package com.example;

/**
 * AdapterCircle类是一个适配器，使Circle类能够像Polygon一样使用。
 *
 */
public class AdapterCircle implements Polygon {
    Circle circle;

    /**
     * AdapterCircle的构造函数。
     *
     * @param circle 要适配的Circle对象。
     */
    AdapterCircle(Circle circle) {
        this.circle = circle;
    }

    /**
     * 绘制圆（作为Polygon接口实现的一部分）。
     */
    @Override
    public boolean draw() {
        circle.drawCircle();
        return true;
    }

    /**
     * 检查给定的顶点是否能构成圆（在此适配器的上下文中）。
     *
     * @param vertices 要检查的顶点。
     * @return 如果顶点能构成圆（在此适配器的上下文中），则返回true，否则返回false。
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        // 假设这里只需要一个顶点作为圆心
        return vertices.length == 1;
    }

    /**
     * 计算圆的面积（作为Polygon接口实现的一部分）。
     *
     * @return 圆的面积。
     */
    @Override
    public float calcArea() {
        return circle.calcAreaCircle();
    }
}