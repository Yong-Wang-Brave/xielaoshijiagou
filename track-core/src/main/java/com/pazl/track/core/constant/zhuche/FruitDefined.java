package com.pazl.track.core.constant.zhuche;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum FruitDefined {
    APPLE("one", "苹果"),
    PEAR("two", "梨");
    private String type;
    private String fruiteName;

    public static String getValueByKey(String key) {
        for (FruitDefined fruitDefined : values()) {
            if (fruitDefined.getType().equals(key)) {
                return fruitDefined.getFruiteName();
            }
        }
        return "";   // 省略getter方法
    }
    public static String getKeyByValue(String value) {
        for (FruitDefined fruitDefined : values()) {
            if (fruitDefined.getFruiteName().equals(value)) {
                return fruitDefined.getType();
            }
        }
        return "";   // 省略getter方法
    }

}