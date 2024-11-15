/**
 * Rectangle类表示一个矩形。
 * 它实现了Polygon接口。
 *
 */
public class Rectangle implements Polygon {
    Vertex[] vertices = new Vertex[4];

    /**
     * 绘制矩形。
     * （在实际应用中，你可能需要实现实际的绘制逻辑）
     */
    @Override
    public boolean draw() {
        // 绘制矩形的代码
        return true;
    }

    /**
     * 检查给定的顶点是否能构成矩形。
     *
     * @param vertices 要检查的顶点。
     * @return 如果顶点能构成矩形，则返回true，否则返回false。
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        // 判断是否能构成矩形的逻辑
        return true;
    }

    /**
     * 计算矩形的面积。
     *
     * @return 矩形的面积。
     */
    @Override
    public float calcArea() {
        // 计算矩形面积的代码
        return 0;
    }
}
