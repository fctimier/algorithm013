学习笔记
git 仓库配置总结
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
使用ssh -keygen -t rsa -C "你的邮箱"
一直往下enter
去到刚才提示的那个文件家里面找到文件后缀为_pub的那个文件。把内容复制到github里面的ssh公钥里面去

10.验证是否配置成功
ssh -T git@github.commit
11.使用git clone 加上复制的ssh的仓库地址
12.git add .
13.git commit -m "要提交的注释"
14.git push -u origin master 将本地的master分支推送到origin主机
15.git pull 拉取git上面的更新

？？？git怎么提交README.md到GitHub上面去


后面换成了ssh方式的直接就先git clone把仓库克隆到了本地，
再按照文章写的，添加文件，cd 到添加过的文件夹里，再git add . 注意得有个点。再提交git commit -m “注释” 最后再把git本地master分支push 到origin分支上