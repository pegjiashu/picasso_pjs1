package com.example.administrator.picasso_pjs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

//https://github.com/square/picasso
//compile"com.squareup.picasso:picasso:2.5.2"
/*
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

*/


public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    String url = "http://t2.hddhhn.com/uploads/tu/201811/9999/4843fd48e9.jpg";
    String url1 ="http://i.imgur.com/C9pBVt7.jpg";
    String url2 = "http://i.imgur.com/rT5vXE1.jpg";
    String url3 = "http://i.imgur.com/aIy5R2k.jpg";

    //picasso 显示本地图片需要 如下格式
    //String realPath = "file://"+new File(url).getPath();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        Picasso.with(MainActivity.this)
                .load(url)

                //.resize(600, 200)  //来自定义图片的加载大小
                //.onlyScaleDown() // 如果图片规格大于6000*2000,将只会被resize

                //.placeholder(R.drawable.default_bg) //placeholder提供一张在网络请求还没有完成时显示的图片，它必须是本地图片
                //.error(R.drawable.error_iamge) //和placeholder 的用法一样，error 提供一张在加载图片出错的情况下显示的默认图

                //.noFade() //渐入的效果

                //.fit() //智能展示图片
                //.priority(Picasso.Priority.HIGH) //设置图片加载的优先级 HIGH, MEDIUM, 和 LOW,所有的加载默认优先级为MEDIUM

                //.centerInside() // 图片会被剪切,但是图片质量看着没有什么区别
                //.centerCrop() //图片会被完整的展示,可能图片不会填充满ImageView`,也有可能会被拉伸或者挤压

                //.noFade() //如果调用了noFade(),加载的图片将直接显示在ImageView上


                //.memoryPolicy(MemoryPolicy.NO_CACHE,MemoryPolicy.NO_STORE)//跳过内存缓存
                //.networkPolicy(NetworkPolicy.NO_CACHE)//跳过磁盘缓存
                //.networkPolicy(NetworkPolicy.OFFLINE)//强制从缓存获取结果
                .into(imageView);

        Picasso.with(this)
                .setIndicatorsEnabled(true);//显示指示器 绿色表示从内存加载、蓝色表示从磁盘加载、红色表示从网络加载
                //Picasso.with(getApplicationContext()).invalidate(url); //清除某个url图片已经下载了

                /*

                .placeholder(R.mipmap.ic_launcher)
                .into(imageView, new Callback() {
                    public void onSuccess() {
                        // 当上次加载完成后,进行二次加载
                        Picasso.with(MainActivity.this)
                                .load(url1)
                                .noPlaceholder()
                                .into(imageView);
                    }

                    public void onError() {

                    }
                });

                */
    }
}
