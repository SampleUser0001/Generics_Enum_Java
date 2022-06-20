# Generics_Enum_Java
enumで型を振り分ける。

## 実行

``` bash
mvn clean compile test
```

## 実装

ジェネリクスはいらなかったわけだが。

``` java
package sample.generics.enums;

public enum SampleEnum {
    Int {
        @Override
        public Integer get() {
            return 10;
        }
    },
    Str {
        @Override
        public String get() {
            return "hoge";
        }
    };
    
    public abstract Object get();
}
```