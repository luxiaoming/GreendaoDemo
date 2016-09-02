# GreendaoDemo
GreendaoDemo 


![](http://upload-images.jianshu.io/upload_images/1603789-6dfadd5202cd2d09?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

GreenDao 之前的版本不敢苟同，使用起来繁琐异常，近期升级到3.1版本，发现已经支持了注释方式，比起之前的确实好很多，可以推荐使用了。

既然可以使用了，那我们开始学习如何使用它。
1 在项目的根节点的build.gradle

![](http://upload-images.jianshu.io/upload_images/1603789-1852e14d38b13877?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

将依赖加入

2 在模块的根节点的build.gradle

![](http://upload-images.jianshu.io/upload_images/1603789-f20900d44b18b176?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

将插件加入

3 在android{}加入

![](http://upload-images.jianshu.io/upload_images/1603789-68fe9903582a7fa3?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

各个名称的意义已经表明 一般情况下就使用版本值 和代码生成位置即可。

4 在dependencies 加入

![](http://upload-images.jianshu.io/upload_images/1603789-09e0ddf5abb32ca3?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

将greendao代码加入进来

5 实现一个User类

![](http://upload-images.jianshu.io/upload_images/1603789-dd72f161f9f7bc6c?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

关键的说明，注释，都写在上面了，一目了然  编译下代码，则生成对应一系列代码。

![](http://upload-images.jianshu.io/upload_images/1603789-a45c6eb7840eb3fc?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

关于index的介绍，参考

http://www.w3school.com.cn/sql/sql_create_index.asp
了解详情。
6 使用

![](http://upload-images.jianshu.io/upload_images/1603789-6be7813025eec8e5?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

很好使用吧

7 代码地址
https://github.com/luxiaoming/GreendaoDemo

![](http://upload-images.jianshu.io/upload_images/1603789-c0a55382ea12eb8b?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
