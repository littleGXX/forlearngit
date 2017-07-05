package com.nowcoder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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

        //  StringBuilder are not safe for use by multiple threads, StringBuffer are safe for use by multiple threads
        //  StringBuilder Improving string processing performance
        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append(1);
        sb.append(2.2);
        print(16, sb.toString());
        print(17, "a"+"b"+String.valueOf(12));
    }

    public static void demoList() {
        List<String> strList = new ArrayList<String>();
        for(int i = 0; i < 4; i++){
            strList.add(String.valueOf(i));
            strList.add(String.valueOf(i));
            strList.add(String.valueOf(i));
        }
        print(1, strList);
        List<String> strListB = new ArrayList<String>();
        for(int i = 0; i < 4; i++){
            strListB.add(String.valueOf(i * i));
        }
        strList.addAll(strListB);
        print(2, strListB);
        print(3, strList);
        strList.remove(0);
        print(3, strList);
        strList.remove(String.valueOf(1));
        strList.remove(String.valueOf(9));
        print(4, strList);
        print(5, strList.get(1));

        Collections.sort(strList);
        print(6, strList);

        //  reverse sort
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(7, strList);

        Collections.reverse(strList);
        print(8, strList);

        int[] array = new int[]{1,2,3};
        print(9, array[1]);
    }

    // do not support Duplicate elements
    public static void demoSet(){
        Set<String> strSet = new HashSet<String>();
        for (int i = 0; i < 3; ++i) {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        strSet.addAll(Arrays.asList(new String[]{"A","B","C"}));
        print(4, strSet);

        for (String value : strSet){
            print(5, value);
        }
        print(6, strSet.isEmpty());
        print(7, strSet.size());
    }

    public static void demoKeyValue() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey()+":"+entry.getValue());
        }

        print(3, map.keySet());
        print(4, map.values());
        print(5, map.containsKey("2"));
        print(6, map.get("1"));
        map.replace("1", "A");      // default V replace(K key, V value)
        print(7, map);
    }

    public static void demoException(){
        try {
            print(1, "hello");
//            int a = 2;
//            a = a / 0;	// {4}, Exception
            String b = null;
            b.indexOf('a');	// {3}, NPE

        } catch (NullPointerException npe) {
            print(3, "NPE");
        } catch (Exception e) {
            print(4, "Exception");
        } finally {
            print(2, "finally");
        }
    }

    public static void demoCommon(){
        Random random = new Random();
//        random.setSeed(1);
        for (int i = 0; i < 4; ++i){
            print(1, random.nextInt(100));
            print(2, random.nextDouble());
        }
        List<Integer> array = Arrays.asList(new Integer[]{1,2,3,4,5});
        print(3, array);
        Collections.shuffle(array);
        print(4, array);

        Date date = new Date();
        print(5, date);
        print(6, date.getTime());
        DateFormat df = new SimpleDateFormat("HH:mm:ss yyyy/MM/dd");
        print (7, df.format(date));
        print(8, DateFormat.getDateInstance(DateFormat.FULL).format(date));

        print(9, UUID.randomUUID());
        print(10, Math.max(1, 2));
        print(11, Math.ceil(2.2));
        print(12, Math.floor(2.5));
        print(13, Math.log(2.71));
    }

    public static Animal getAnimal(int type) {
        //return new Animal("2", 1);
        return new Human("Lei", 22, "CN");
    }

    public static void demoClass() {
        Talking animal = new Animal("Jim", 1);
        animal.say();
        animal = new Human("Lei", 11, "CN");
        animal.say();
    }

    public static void main(String[] args) {
//        System.out.println("hello nowcoder");
//        demoString();
//        demoList();
//        demoSet();
//        demoKeyValue();
//        demoException();
//        demoCommon();
        demoClass();
    }
}
