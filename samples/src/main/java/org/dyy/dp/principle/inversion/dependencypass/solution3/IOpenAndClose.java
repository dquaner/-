package org.dyy.dp.principle.inversion.dependencypass.solution3;

/**
 * 方式3：通过setter方法传递依赖
 */
interface IOpenAndClose {
    void open();
    void setTv(ITV tv);
}
