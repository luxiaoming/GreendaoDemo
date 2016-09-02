package com.xm.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.OrderBy;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.DaoException;

@Entity(
        // Flag to make an entity "active": Active entities have update,
        // delete, and refresh methods.
        // 一般情况下不要这个标记
        active = false,
        // Specifies the name of the table in the database.
        // By default, the name is based on the entities class name.
        // 默认table为类名，这个默认可以不用，自己需要自定义名字时候添加
        nameInDb = "AWESOME_USERS",
        // Define indexes spanning multiple columns here.
        //定义索引，可以加快搜索，这里unique标记意思表示name值需要唯一，否则出错
//        indexes = {
//               @Index(value = "name DESC", unique = true)
//        },

        // Flag if the DAO should create the database table (default is true).
        // Set this to false, if you have multiple entities mapping to one table,
        // or the table creation is done outside of greenDAO.
        // 默认true，是需要的。
        createInDb = true,

        // Whether an all properties constructor should be generated.
        // A no-args constructor is always required.
        // 是否生成构造函数，所有的属性作为参数
        generateConstructors = true
)
public class User {
    // 自增的Id值 ，这里只能是long类型
    @Id(autoincrement = true)
    private Long id;
    // name在数据库里面的列表名字
    @Property(nameInDb = "Nam")
    private String name;
    //标注这个意思tmp不需要存储在数据库里面
    @Transient
    private int tmp;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Generated(hash = 873297011)
    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Generated(hash = 586692638)
    public User() {
    }

}
