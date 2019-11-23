package top.lllyl2012.gmall.enums;

public enum FileSuffixEnum {
    Txt(".txt");

    private String suffix;

    FileSuffixEnum(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
