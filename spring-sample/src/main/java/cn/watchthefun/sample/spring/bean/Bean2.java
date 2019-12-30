package cn.watchthefun.sample.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther geyx
 * @date 2019/12/30
 */
public class Bean2 {
    private String desc;
    @Autowired
    private Bean1 bean1;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    @Override
    public String toString() {
        return "Bean2{" +
                "desc='" + desc + '\'' +
                ", bean1=" + bean1 +
                '}';
    }
}
