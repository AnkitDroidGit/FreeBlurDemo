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
                        
                        
                        
### Contact - Let's connect to each other
- [Twitter](https://twitter.com/KumarAnkitRKE)
- [Github](https://github.com/AnkitDroidGit)
- [LinkedIn](https://www.linkedin.com/in/kumarankitkumar/)
- [Facebook](https://www.facebook.com/freeankit)
- [Slack](https://ankitdroid.slack.com)
- [Stackoverflow](https://stackoverflow.com/users/3282461/android)
- [Android App](https://play.google.com/store/apps/details?id=com.freeankit.ankitprofile)

### License

    Copyright 2017 Ankit Kumar
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.                        
