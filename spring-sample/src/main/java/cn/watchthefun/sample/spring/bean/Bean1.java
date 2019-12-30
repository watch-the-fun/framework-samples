package cn.watchthefun.sample.spring.bean;

/**
 * @auther geyx
 * @date 2019/12/30
 */
public class Bean1 {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
