package com.rcc.entity;

/**
 * com.rcc.entity
 * 测试使用的实体类
 * @author rencc
 * @Note
 * @Date 2017-09-04 14:06
 */
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User user = (User) o;
//
//        return name.equals(user.name);
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name.hashCode();
//        return result;
//    }
}
