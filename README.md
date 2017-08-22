# FreeBlurDemo

![GIF](https://github.com/AnkitDroidGit/FreeBlurDemo/blob/master/app/art/video_blur.gif)



Add to project level build.gradle's repositories

    maven {
           url 'https://dl.bintray.com/ankitdroiddeveloper/FreeBlurEffect'
     }
                
Add dependency to app level build.gradle

    implementation 'com.freeankit.blurcontroller:freeblurcontroller:1.0.0'   // in Android Studio 3.0 and above
         
    complie 'com.freeankit.blurcontroller:freeblurcontroller:1.0.0'   // in Android Studio 2.3.3 and older
        
        
Layout /ViewGroup Blur

    FreeBlurController.with(this@MainActivity)
                                   .radius(25)
                                   .sampling(2)
                                   .async()
                                   .animate(500)
                                   .onto(findViewById<View>(R.id.content) as ViewGroup)
                                   
ImageView Blur

    FreeBlurController.with(this@MainActivity)
                                .radius(10)
                                .sampling(8)
                                .async()
                                .capture(findViewById<View>(R.id.bottom))
                                .into(findViewById<View>(R.id.bottom) as ImageView)
                                
                                
 And
 
 
    FreeBlurController.with(this@MainActivity)
                        .radius(25)
                        .sampling(1)
                        .color(Color.argb(66, 0, 255, 255))
                        .async()
                        .capture(findViewById<View>(R.id.top))
                        .into(findViewById<View>(R.id.top) as ImageView)