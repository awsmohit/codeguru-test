Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@awsmohit 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


aws-samples
/
aws-codeguru-profiler-demo-application
4
34
 Code
 Issues 0
 Pull requests 0 Actions
 Security 0
 Insights
aws-codeguru-profiler-demo-application/src/main/java/com/company/demoapplication/ImageEditor.java /
@olivergillespie olivergillespie Initial commit
0648cf0 on Mar 24
25 lines (19 sloc)  696 Bytes
  
Code navigation is available!
Navigate your code with ease. Click on function and method calls to jump to their definitions or references in the same repository. Learn more

/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: MIT-0
 */

package com.company.demoapplication;

import org.imgscalr.Scalr;

import java.awt.*;
import java.awt.image.BufferedImage;

class ImageEditor {

    static BufferedImage brightenImage(BufferedImage image) {
        return Scalr.apply(image, Scalr.OP_BRIGHTER);
    }

    static BufferedImage monochrome(BufferedImage image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D graphics = newImage.createGraphics();
        graphics.drawImage(image, 0, 0, null);
        return newImage;
    }
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
