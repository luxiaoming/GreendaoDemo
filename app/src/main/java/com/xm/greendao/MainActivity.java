package com.xm.greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private UserDao userdao;
    private List<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //拿到dao
        userdao = DaoMaster.newDevSession(this, "use.db").getUserDao();
        //构造数据
        User user = new User();
        user.setName("code_gg");
        //插入数据
        userdao.insert(user);
        //获取全部数据
        users = userdao.loadAll();

        //删除
        userdao.delete(user);

        // 插入或者替换
        userdao.insertOrReplace(user);

        // 用查询语句
        users=userdao.queryBuilder().where(UserDao.Properties.Name.eq("code_gg")).build().list();

         // 想使用rx，可以使用如下方式
        //userdao.rx().
    }
}
