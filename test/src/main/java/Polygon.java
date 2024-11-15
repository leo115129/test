/**
 * Polygon接口定义了多边形的方法。
 * 实现此接口的类应提供绘制、检查顶点是否能构成多边形以及计算面积的实现。
 *
 */
public interface Polygon {
    /**
     * 绘制多边形。
     */
     boolean draw();

    /**
     * 检查给定的顶点是否能构成多边形。
     *
     * @param vertices 要检查的顶点。
     * @return 如果顶点能构成多边形，则返回true，否则返回false。
     */
    boolean canForm(Vertex[] vertices);

    /**
     * 计算多边形的面积。
     *
     * @return 多边形的面积。
     */
    float calcArea();
}
