package com.nowcoder;

/**
 * Created by GXiang on 2017/7/5.
 */
public class Main {

    /**
     * 打印对象
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj){
        System.out.println(String.format("{%d}, %s", index, obj.toString()));
    }

    public static void demoControlFlow(){
        String grade = "B";
        switch (grade){
            case "A":
                print(4, "score > 80");
                break;
            case "B":
                print(5, "(60, 80)");
                break;
            default:
                print(6, "(0, 60)");
                break;
        }

        String str = "hello";
        for(char c : str.toCharArray()){
            print(7, c);
        }
    }

    public static void demoString(){
        String str = "hello nowcoder";
        print(1, str.indexOf('e'));
        print(2, str.charAt(6));
        print(3, str.codePointAt(1));	// ascii
        print(4, str.compareTo("hello mowcoder")); //strcmp
        print(5, str.compareTo("hello powcoder")); //strcmp
        print(6, str.compareToIgnoreCase("Hello Nowcoder"));
        print(7, str.concat("!!"));
        print(8, str.contains("hello"));
        print(9, str.endsWith("xowcoder"));
        print(10, str.startsWith("hello"));
        print(11, str.lastIndexOf('o'));
        print(12, str.toUpperCase());
        print(13, str.replace('o', 'a'));
        print(14, str.replaceAll("o|l", "a"));
        print(15, str.replaceAll("hello", "hi"));

        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append(1);
        sb.append(2.2);
        print(16, sb.toString());
        print(17, "a"+"b"+String.valueOf(12));
    }

    public static void main(String[] args) {
//        System.out.println("hello nowcoder");
        demoString();
    }
}
