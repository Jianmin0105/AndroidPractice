## Android Thread
```
Main thread (UI thread)
Worker thread: usually worker thread cannot update UI. UI updation should happened in UI thread.
```
But worker thread can control progress bar. If you update textView in worker thread, there will be fatal thread error.

<p align="center">
<img src="https://github.com/Jianmin0105/images/blob/master/thread-demo.gif" weight="30%" height="30%"/>
</p>
