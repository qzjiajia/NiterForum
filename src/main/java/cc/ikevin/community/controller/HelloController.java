package cc.ikevin.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
       /* User user = (User) request.getSession().getAttribute("user");
        String xlm_wid ="14875";
        String xlm_url="https://www.xianliao.me/";
        String xlm_uid = ""+user.getId();
        String xlm_name = user.getName();
        String xlm_avatar = ""+user.getAvatarUrl();
        String xlm_time = ""+(int)(System.currentTimeMillis()/1000);
        String sso_key = "dsAjGKCiCleHmWoSfqH3MuthGlkf2kGB";
        String xlm_name_encode = URLEncoder.encode(xlm_name);
        String xlm_avatar_encode = URLEncoder.encode(xlm_avatar);
        String s = xlm_wid+"_"+xlm_uid+"_"+xlm_time+"_"+sso_key;
        String xlm_hash = SHA(s, "SHA-512");*/
       // String go = "https://xianliao.me/s/14875?mobile=1&uid="+xlm_uid+"&username="+xlm_name_encode+"&avatar="+xlm_avatar_encode+"&ts="+xlm_time+"&token="+xlm_hash;
       // System.out.println(xlm_name_encode);
       // System.out.println(user.getId()+user.getName()+user.getAvatarUrl());
       // System.out.println(s);
       // System.out.println(xlm_hash);
        return "hello";
      //  return "redirect:"+go;
    }


    private String SHA(final String strText, final String strType)
    {
        // 返回值
        String strResult = null;

        // 是否是有效字符串
        if (strText != null && strText.length() > 0)
        {
            try
            {
                // SHA 加密开始
                // 创建加密对象 并傳入加密類型
                MessageDigest messageDigest = MessageDigest.getInstance(strType);
                // 传入要加密的字符串
                messageDigest.update(strText.getBytes());
                // 得到 byte 類型结果
                byte byteBuffer[] = messageDigest.digest();

                // 將 byte 轉換爲 string
                StringBuffer strHexString = new StringBuffer();
                // 遍歷 byte buffer
                for (int i = 0; i < byteBuffer.length; i++)
                {
                    String hex = Integer.toHexString(0xff & byteBuffer[i]);
                    if (hex.length() == 1)
                    {
                        strHexString.append('0');
                    }
                    strHexString.append(hex);
                }
                // 得到返回結果
                strResult = strHexString.toString();
            }
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
        }

        return strResult;
    }

}
