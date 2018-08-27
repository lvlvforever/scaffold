/**
 * Description:
 * User: daipeng
 * Date: 2018-08-27 15:57
 * Project:scaffold
 */
package io.lvlvforever.util;

import java.util.UUID;

public class JavaUtil {
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("\\-", "");
    }
}
