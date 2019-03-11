package com.spring;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class erweima {
    public static void main(String[] args) {
        QrCodeUtil.generate("https://www.jianshu.com/u/30a17fbf1de2", 300, 300, FileUtil.file("d:/qrcode.jpg"));
        QrConfig config = new QrConfig(300, 300);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
// 设置前景色，既二维码颜色（青色）
        config.setForeColor(Color.BLUE.getRGB());
// 设置背景色（灰色）
        config.setBackColor(Color.GRAY.getRGB());

// 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.jianshu.com/u/30a17fbf1de2", config, FileUtil.file("D:/qrcode.jpg"));

        QrCodeUtil.generate(//
                "https://www.jianshu.com/u/30a17fbf1de2", //二维码内容
                QrConfig.create().setImg("D:/t3.jpg"), //附带logo
                FileUtil.file("D:/qrcodeWithLogo.jpg")//写出到的文件
        );
    }


}
