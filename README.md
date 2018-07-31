

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

## OpenGLVideoRecord  
通过OpenGL音视频录制项目  

## OpenGLES20Study

### 一：基本形状的绘制
#### 平面：
三角形、正方形、在相机视角下的三角形、彩色三角形

#### 立体：
正方体、圆柱体、圆锥体、球体

#### 基本交互
手绘点、旋转三角形

### 二：纹理绘制

#### 纹理映射
绘制图片

#### 纹理过滤
黑白效果、冷色调效果、暖色调效果、模糊效果、放大镜效果

#### 矩阵处理
平移、旋转、缩放


### 三：OpenGLES + Camera

### 预览
利用OpenGLES完成Camera基本预览效果

### 拍照
基于预览完成拍照，并增加水印功能










