/**
 * Triangle类表示一个三角形。
 * 它实现了Polygon接口。
 *
 */
public class Triangle implements Polygon {
    Vertex[] vertices = new Vertex[3];

    /**
     * 绘制三角形。
     * （在实际应用中，你可能需要实现实际的绘制逻辑）
     */
    @Override
    public boolean draw() {
        // 绘制三角形的代码
        return true;
    }

    /**
     * 检查给定的顶点是否能构成三角形。
     *
     * @param vertices 要检查的顶点。
     * @return 如果顶点能构成三角形，则返回true，否则返回false。
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        // 判断是否能构成三角形的逻辑
        return true;
    }

    /**
     * 计算三角形的面积。
     *
     * @return 三角形的面积。
     */
    @Override
    public float calcArea() {
        // 计算三角形面积的代码
        return 0;
    }
}
