package com.wen.task3;

import javax.jnlp.ClipboardService;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 18:00
 */
public class Test {
    public static void main(String[] args) {
        Node head = new Node("头节点");
        Link link = new Link(head);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.增 2.删 3.改 4.查 5.撤");
            switch (scanner.nextInt()){
                case 1:
                    link.addNode(scanner.next());
                    break;
                case 2:
                    System.out.println("请输入删除的索引或者内容");
                    link.deleteNode(link.findContent(scanner.nextInt()));
                    break;
                case 3:
                    System.out.println("请输入修改的索引或者内容和修改后的内容");
                    link.changeContent(link.findContent(scanner.nextInt()),scanner.next());
                    break;
                case 4:
                    System.out.println("请输入查找的索引或者内容");
                    System.out.println(link.findContent(scanner.nextInt()).getName());
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }

    }
}
