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
