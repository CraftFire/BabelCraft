/**
(C) Copyright 2011 CraftFire <dev@craftfire.com>
Contex <contex@craftfire.com>, Wulfspider <wulfspider@craftfire.com>

This work is licensed under the Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License.
To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/
or send a letter to Creative Commons, 171 Second Street, Suite 300, San Francisco, California, 94105, USA.
**/

package com.craftfire.babelcraft.util.managers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import com.craftfire.babelcraft.util.Encryption;

public class CraftFireManager {
    Encryption encryption = new Encryption();
    public void postInfo(String b407f35cb00b96936a585c4191fc267a, String f13a437cb9b1ac68b49d597ed7c4bfde, String cafd6e81e3a478a7fe0b40e7502bf1f, String fcf2204d0935f0a8ef1853662b91834e, String aa25d685b171d7874222c7080845932, String fac8b1115d09f0d816a0671d144d49e, String e98695d728198605323bb829d6ea4de, String d89570db744fe029ca696f09d34e1, String fe75a95090e70155856937ae8d0482, String a6118cfc6befa19cada1cddc32d36a3, String d440b827e9c17bbd51f2b9ac5c97d6, String c284debb7991b2b5fcfd08e9ab1e5, int d146298d6d3e1294bbe4121f26f02800) throws IOException {
        String d68d8f3c6398544b1cdbeb4e5f39f0 = "1265a15461038989925e0ced2799762c";
        String e5544ab05d8c25c1a5da5cd59144fb = encryption.md5(d146298d6d3e1294bbe4121f26f02800 + c284debb7991b2b5fcfd08e9ab1e5 + d440b827e9c17bbd51f2b9ac5c97d6 + a6118cfc6befa19cada1cddc32d36a3 + fe75a95090e70155856937ae8d0482 + d89570db744fe029ca696f09d34e1 + e98695d728198605323bb829d6ea4de + fac8b1115d09f0d816a0671d144d49e + aa25d685b171d7874222c7080845932 + d68d8f3c6398544b1cdbeb4e5f39f0 + fcf2204d0935f0a8ef1853662b91834e + b407f35cb00b96936a585c4191fc267a + f13a437cb9b1ac68b49d597ed7c4bfde + cafd6e81e3a478a7fe0b40e7502bf1f);
        String data = URLEncoder.encode("b407f35cb00b96936a585c4191fc267a", "UTF-8") + "=" + URLEncoder.encode(b407f35cb00b96936a585c4191fc267a, "UTF-8");
        data += "&" + URLEncoder.encode("f13a437cb9b1ac68b49d597ed7c4bfde", "UTF-8") + "=" + URLEncoder.encode(f13a437cb9b1ac68b49d597ed7c4bfde, "UTF-8");
        data += "&" + URLEncoder.encode("9cafd6e81e3a478a7fe0b40e7502bf1f", "UTF-8") + "=" + URLEncoder.encode(cafd6e81e3a478a7fe0b40e7502bf1f, "UTF-8");
        data += "&" + URLEncoder.encode("58e5544ab05d8c25c1a5da5cd59144fb", "UTF-8") + "=" + URLEncoder.encode(e5544ab05d8c25c1a5da5cd59144fb, "UTF-8");
        data += "&" + URLEncoder.encode("fcf2204d0935f0a8ef1853662b91834e", "UTF-8") + "=" + URLEncoder.encode(fcf2204d0935f0a8ef1853662b91834e, "UTF-8");
        data += "&" + URLEncoder.encode("3aa25d685b171d7874222c7080845932", "UTF-8") + "=" + URLEncoder.encode(aa25d685b171d7874222c7080845932, "UTF-8");
        data += "&" + URLEncoder.encode("6fac8b1115d09f0d816a0671d144d49e", "UTF-8") + "=" + URLEncoder.encode(fac8b1115d09f0d816a0671d144d49e, "UTF-8");
        data += "&" + URLEncoder.encode("5e98695d728198605323bb829d6ea4de", "UTF-8") + "=" + URLEncoder.encode(e98695d728198605323bb829d6ea4de, "UTF-8");
        data += "&" + URLEncoder.encode("189d89570db744fe029ca696f09d34e1", "UTF-8") + "=" + URLEncoder.encode(d89570db744fe029ca696f09d34e1, "UTF-8");
        data += "&" + URLEncoder.encode("70fe75a95090e70155856937ae8d0482", "UTF-8") + "=" + URLEncoder.encode(fe75a95090e70155856937ae8d0482, "UTF-8");
        data += "&" + URLEncoder.encode("9a6118cfc6befa19cada1cddc32d36a3", "UTF-8") + "=" + URLEncoder.encode(a6118cfc6befa19cada1cddc32d36a3, "UTF-8");
        data += "&" + URLEncoder.encode("94d440b827e9c17bbd51f2b9ac5c97d6", "UTF-8") + "=" + URLEncoder.encode(d440b827e9c17bbd51f2b9ac5c97d6, "UTF-8");
        data += "&" + URLEncoder.encode("234c284debb7991b2b5fcfd08e9ab1e5", "UTF-8") + "=" + URLEncoder.encode(c284debb7991b2b5fcfd08e9ab1e5, "UTF-8");
        data += "&" + URLEncoder.encode("41d68d8f3c6398544b1cdbeb4e5f39f0", "UTF-8") + "=" + URLEncoder.encode(d68d8f3c6398544b1cdbeb4e5f39f0, "UTF-8");
        data += "&" + URLEncoder.encode("d146298d6d3e1294bbe4121f26f02800", "UTF-8") + "=" + URLEncoder.encode("" + d146298d6d3e1294bbe4121f26f02800, "UTF-8");
        Managers.logging.debug("Preparing usage stats for submission.");
        URL url = new URL("http://www.craftfire.com/stats.php");
        URLConnection conn = url.openConnection();
        conn.setConnectTimeout(4000);
        conn.setReadTimeout(4000);
        Managers.logging.debug("Usage stats submission timeout is 4000 ms (4 seconds).");
        conn.setRequestProperty("X-AuthDB", e5544ab05d8c25c1a5da5cd59144fb);
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        Managers.logging.debug("Attempting to submit usage stats.");
        wr.write(data);
        wr.flush();
        wr.close();
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        Managers.logging.debug("Successfully sent usage stats to CraftFire.");
        rd.close();
    }
}
