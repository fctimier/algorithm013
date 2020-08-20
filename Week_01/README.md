# 学习笔记
## git 仓库配置总结
1.下载git，安装
2.window打开GitBash
3.输入 git --version命令查看git是否安装成功

4.GitHub上把别人的仓库fork下来，就变成了自己的仓库了
5.在GitHub上点击clone，出现的两个选项里，选用ssh方式的地址复制链接

6.配置本地仓库  创建一个要作为仓库的git文件夹 。cd到这个文件夹里面后用git status 查看当前文件夹的仓库状态。

7.如果是空，用git init 初始化这个文件夹

8.配置git ,进行配置用户名和邮箱
git config --global user.name "用户名"
git config --global user.email "邮箱"
git config --global --list

9.配置公私钥
使用ssh-keygen -t rsa -C "你的邮箱"
一直往下enter
去到刚才提示的那个文件家里面找到文件后缀为_pub的那个文件。把内容复制到github里面的ssh公钥里面去

10.验证是否配置成功
ssh -T git@github.commit
11.使用git clone 加上复制的ssh的仓库地址
12.git add .
13.git commit -m "要提交的注释"
14.git push -u origin master 将本地的master分支推送到origin主机
15.git pull 拉取git上面的更新

16. Git创建本地仓库，然后将本地仓库推送到github上
16.1 在本地仓库上执行以上操作。
16.2 在github上面创建一个远端git仓库,拿到github的仓库地址
16.3 将本地的Git仓库和GitHub仓库关联 git remote add origin Github仓库地址
16.4 Local仓库将本地仓库master分支推送到远端仓库上面去。git push origin master

后面换成了ssh方式的直接就先git clone把仓库克隆到了本地，
再按照文章写的，添加文件，cd 到添加过的文件夹里，再git add . 注意得有个点。再提交git commit -m “注释” 最后再把git本地master分支push 到origin分支上
## 编程技巧
    自顶向下的编程
    案例：回文串
    把数字和非数字字符全部过滤掉（只考虑字母和数字）忽略大小写
    corner caser 奇怪的边界条件
    思考大部分层次逻辑，主干逻辑
    先写最上层的主干逻辑，把子函数写出来，然后再层层递进
## 数组，链表，跳表
    数组 -- Array。访问任何一个元素的数组元素是O(1),插入O(n),删除O(n)，
    ArrayList.增加元素时。如果大于当前数组长度，则空间翻。初始是10。
链表。双向链表（Node链表有前驱节点和后续节点），单向链表（只有后继节点）。循环链表（尾节点的后继节点指向头节点）
LinkedList
跳表
对链表的优化。在元素有序的情况下对元素进行快速的查询。
## 栈(Stack) 队列（quene) 双向队列(dequene) 优先队列（PriorityQuene）
### stack
    继承自Vector<E> (线程安全的) 
#### Vector
    可变数组。超出最大的增长是翻倍增长。默认长度是10 .最大长度为Integer.MAX_VALUE(0x7fffffff)-8,indexOf(e)的时间复杂度是O(n).indexOf(e),比较的时候调用的是Object对象的equals方法。
    add(o);o(1)
    remove(o);O(n)
    indexOf(o);o(n)
#### 特性
    后进先出
#### 底层实现 
    底层实现是通过数组实现。pop,push,peek.等方法都是调用了vector类的线程安全方法，所以这些方法都是线程安全的。addElement(Object),removeElement(object). 容量的增长是翻倍增长。push，peek,pop的时间复杂度是O（1）.pop是依赖于peek方法。
 ## 队列(queue)
    也是用数组实现。
    特殊的线性表
    先进先出
    只可以往前遍历
    遍历？
 ## 双向队列（dequeue)
    LinkedList继承了Dequeue接口,addFirst,addLast,getLast,getLast,
    可以往前遍历，也可以往后遍历
    offer();==add();==linkLast();O(1)
    offerFirst();==addFirst();==linkFirst();O(1)
    peekFirst();
    pollFirst();== unlink(first);
    pop();--removeFirst();O(1)
    迭代器
    listIterator();
    listIterator(index);//linkedList内部定义的迭代器
## 优先队列（priorityQueue)

    
    

    
