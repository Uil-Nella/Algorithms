/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.algorithm.sha;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by liuxinyu on 15/3/27.
 */
public class Sha1Test {
    public static void main(String[] args) {
        String str = DigestUtils.shaHex("sdf");
        System.out.println(str);

        String str2 = DigestUtils.shaHex("sff");
        System.out.println(str2);

        String str3 = DigestUtils.shaHex("sdd");
        System.out.println(str3);

    }
}
