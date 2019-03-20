/*
 * 微信公众平台(JAVA) SDK
 *
 * Copyright (c) 2014, Ansitech Network Technology Co.,Ltd All rights reserved.
 * 
 * http://www.weixin4j.org/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.weixin4j.model.message;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 图片
 *
 * @author yangqisheng
 * @since 0.0.1
 */
@XmlRootElement(name = "item")
public class PicList {

    //图片的MD5值，开发者若需要，可用于验证接收到图片
    private String PicMd5Sum;

    public String getPicMd5Sum() {
        return PicMd5Sum;
    }

    @XmlElement(name = "PicMd5Sum")
    public void setPicMd5Sum(String PicMd5Sum) {
        this.PicMd5Sum = PicMd5Sum;
    }
}
