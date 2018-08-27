/**
 * Description:
 * User: daipeng
 * Date: 2018-08-27 15:53
 * Project:scaffold
 */
package io.lvlvforever.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("subfile")
public class SubFileController extends BaseFileController {
    @Override
    public String getStorageDir() {
        return "e:\\tmp1\\";
    }

    @Override
    public String getExtName() {
        return ".png";
    }
}
