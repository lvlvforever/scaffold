/**
 * Description:
 * User: daipeng
 * Date: 2018-08-24 15:38
 * Project:scaffold
 */
package io.lvlvforever.tinydemo;

public class User {
    private String name;
    private String sex;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
