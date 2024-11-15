package com.example;

/**
 * Circle类表示二维空间中的一个圆。
 * 它包含圆心顶点和半径，以及绘制圆和计算其面积的方法。
 *
 */
public class Circle {
    Vertex center;
    float radius;

    /**
     * 绘制圆。
     * （在实际应用中，你可能需要实现实际的绘制逻辑）
     */
    void drawCircle() {
        // 绘制圆形的代码
    }

    /**
     * 计算圆的面积。
     *
     * @return 圆的面积。
     */
    float calcAreaCircle() {
        if(radius<0){
          return 0;
        }
        return (float) (Math.PI * radius * radius);
    }
}