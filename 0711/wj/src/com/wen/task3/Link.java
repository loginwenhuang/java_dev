package com.wen.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 20:00
 */
public class Link {
    Node head;
    public int length;

    public Link(Node head) {
        this.head = head;
    }

    public void addNode(String nodeName){
        Node node = new Node(nodeName);
        Node p = head;
        while(true){
            if(p.getNext()==null){
                p.setNext(node);
                length++;
                break;
            }
            p=p.getNext();
        }

    }
    public void display(){
        Node p = head.getNext();
        while (p!=null){
            System.out.print(p.getName()+",");
            p=p.getNext();
        }
    }

    //按索引查询
    public Node findContent(int index){
        Node p =head;
        int i = 0;
        while (p!=null){
            if(i==index){
                return p;
            }
            p = p.getNext();
            i++;
        }
        return null;
    }

    //按内容查询
    public Node findContent(String name){
        Node p = head;
        while(p!=null){
            if(p.getName().equals(name)){
                return p;
            }
            p = p.getNext();
        }
        return null;
    }

    //插入节点
    public void insertAfter(int index,Node newNode){
        Node node = findContent(index);
        if(node!=null){
            newNode.setNext((node.getNext()));
            node.setNext(newNode);
        }
    }

    //删除节点
    public void deleteNode(Node node){
        Node p = head;
        System.out.println(node.getName());
        while (p.getNext()!=null){
            if(node.getName().equals(p.getNext().getName())){
                p.setNext(p.getNext().getNext());
            }
            p=p.getNext();
        }
    }

    //修改内容
    public void changeContent(Node node,String newContent){
        Node p = head;

        while (p!=null){
            if(node.getName().equals(p.getName())){
                node.setName(newContent);
                System.out.println("修改成功："+node.getName());
            }
            p=p.getNext();
        }
    }
}
