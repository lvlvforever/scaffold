/**
 * Description:
 * User: daipeng
 * Date: 2018-08-27 15:17
 * Project:scaffold
 */
package io.lvlvforever.file;

import io.lvlvforever.util.JavaUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("baseFile")
public class BaseFileController {

    @Value("${base.file.dir}")
    private String storageBaseDir;

    public String uuid() {
        return JavaUtil.getUUID();
    }

    public String getStorageDir() {
        return storageBaseDir;
    }

    public String getExtName() {
        return "";
    }


    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Map<String, String> uploadFile(@RequestParam(value = "file") MultipartFile file) {
        Map<String, String> map = new HashMap<>();
        map.put("status", "failure");
        String storageDir = getStorageDir();
        String uuid = uuid();
        String savedPath = storageDir + uuid + getExtName();
        if (!file.isEmpty()) {
            File parentDir = new File(storageDir);
            if (!parentDir.exists()) {
                parentDir.mkdirs();
            }
            File dest = new File(savedPath);
            try {
                file.transferTo(dest);
                map.put("status", "success");
                map.put("fileId", uuid);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        return map;
    }
}
