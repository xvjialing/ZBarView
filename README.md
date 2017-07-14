# ZBarView 二维码扫描
1. Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

    'allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }'
 	
 2. Copy Step 2. Add the dependency
 
        dependencies {
             compile 'com.github.xvjialing:ZBarView:v1.0'
        }
  	
 3. how to use.

* first
 
        startActivityForResult(new Intent(this, ZXingViewActivity.class),REQUESTCODE);
 
* second

        @Override
         protected void onActivityResult(int requestCode, int resultCode, Intent data) {
             super.onActivityResult(requestCode, resultCode, data);
     
             switch (requestCode){
                 case REQUESTCODE:
                     if (resultCode==RESULT_OK){
                         String result = data.getStringExtra("result").toString();
                     }
                     break;
             }
         }
     