package DataStruct;

import java.util.Stack;

/**
 *
 * 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
 * 堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。
 * 1）pop：移除堆栈顶部元素
 * 2）peek：查看堆栈顶部的元素，但不从堆栈中移除它
 * 3）empty() : 测试堆栈是否为空
 * @param <I>
 */
public class StackDemo<I extends Number> {

    public static void main(String[] args){
        stackDemo();
    }

    // 栈是vector的一个子类，实现了一个标准的后进先出的栈
    public static void stackDemo(){
        Stack<Integer> stack = new Stack<>();
        // push: 把元素压入堆栈顶部
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        // pop：移除堆栈顶部元素
        System.out.println("移除堆栈顶部元素");
        stack.pop();
        System.out.println(stack);
        // peek：查看堆栈顶部的元素，但不从堆栈中移除它
        System.out.println("堆栈顶元素为：" + stack.peek());
        // empty() : 测试堆栈是否为空
        System.out.println("堆栈是否为空：" + stack.empty());
    }



}
