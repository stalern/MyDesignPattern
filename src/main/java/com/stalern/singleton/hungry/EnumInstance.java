package com.stalern.singleton.hungry;

/**
 * Effective Java 枚举类生成单例模式
 * 天然克序列化和反射
 * @author stalern
 * @date 2019/10/5--13:48
 */
public enum EnumInstance {

    /**
     * 实例
     */
    INSTANCE;

    private Object data;

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
