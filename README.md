

## showpicture

使用3 种不同的 API (ImageView，SurfaceView，自定义 View)，绘制图片。



## audiodemo

使用 AudioRecord 和 AudioTrack API 完成音频 PCM 数据的采集和播放，并实现读写音频 wav 文件。

## AndroidRecorder  
1.1 需求说明
串联整个音视频录制流程，完成音视频的采集、编码、封包成 mp4 输出。

1.2 实现方式
Android音视频采集的方法：预览用SurfaceView，视频采集用Camera类，音频采集用AudioRecord。

1.3 数据处理思路
使用MediaCodec 类进行编码压缩，视频压缩为H.264，音频压缩为aac，使用MediaMuxer 将音视频合成为MP4。

