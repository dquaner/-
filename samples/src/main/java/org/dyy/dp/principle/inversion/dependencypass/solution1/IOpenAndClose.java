package org.dyy.dp.principle.inversion.dependencypass.solution1;

/**
 * 方式1：通过接口传递实现依赖
 */
interface IOpenAndClose {
    void open(ITV tv); //抽象方法，接收接口
}
