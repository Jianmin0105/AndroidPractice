### what does this simple App do and what lifecyle function call order observed?
#### When the App starts, lifecycle activity (MainActivity) will start first with a button
2020-04-14 20:48:00.571 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onCreate
2020-04-14 20:48:00.590 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onStart
2020-04-14 20:48:00.592 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onResume

#### Once clicked the buttion, App will switch to OtherActivity
2020-04-14 20:48:38.634 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onPause
2020-04-14 20:48:38.829 7145-7145/com.example.androidpractice E/lifecycle: OtherActivity---onCreate
2020-04-14 20:48:38.837 7145-7145/com.example.androidpractice E/lifecycle: OtherActivity---onStart
2020-04-14 20:48:38.838 7145-7145/com.example.androidpractice E/lifecycle: OtherActivity---onResume
2020-04-14 20:48:39.666 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onStop

#### On the OtherActivity, click back to lifecycle activity(MainActivity)
2020-04-14 20:48:53.284 7145-7145/com.example.androidpractice E/lifecycle: OtherActivity---onPause
2020-04-14 20:48:53.296 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onReStart
2020-04-14 20:48:53.308 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onStart
2020-04-14 20:48:53.309 7145-7145/com.example.androidpractice E/lifecycle: MainActivity---onResume
2020-04-14 20:48:53.932 7145-7145/com.example.androidpractice E/lifecycle: OtherActivity---onStop
2020-04-14 20:48:53.940 7145-7145/com.example.androidpractice E/lifecycle: OtherActivity---onDestroy

<p align="center">
<img src="https://github.com/Jianmin0105/images/blob/master/lifetcycle-demo.gif" weight="30%" height="30%"/>
</p>


