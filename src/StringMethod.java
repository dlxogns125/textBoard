import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {

        // startWith() : 문자열이 지정한 문자로 시작하는지 판단
        String apple = "apple";
        System.out.println("startWith : " + apple.startsWith("a"));

        // endWith() : 문자열이 지정한 문자로 끝나는지 판단
        System.out.println("endWith : "+ apple.endsWith("A"));

        // equals() : 두 개의 문자열의 값을 비교해서 같은지 다른지 비교
        String a ="java";
        String b ="java";
        System.out.println("equals : " + a.equals(b));

        // indexOf() : 지정한 문자가 문자열에 몇번째에 있는지를 반환
        String c = "abcdefg";
        System.out.println("indexOf : " + c.indexOf("f"));

        // length() : 문자열의 길이 반환
        String d = "a is apple";
        System.out.println("length : " + d.length());

        // replace(): 문자열에 지정한 문자를 새로 지정한 문자로 바꿔 출력
        String e = "a-b-c-d";
        System.out.println("replace : " + e.replace("-",""));

        // split() : 지정한 문자로 문자열을 나눌때 사용(배열)
        String f = "a-b-c-d-e-f";
        String s[] = f.split("-");
        System.out.println(s[0]);

        // subString() : 문자열에 지정한 범위 내에 속하는 문자열 반환
        // 시작 인덱스, 마지막 인덱스(마지막 인덱스 -1)
        String g = "abcdefghijk";
        System.out.println(g.substring(0,5));

        // charAt() : 지정한 인덱스번째에 있는 문자를 반환
        String h = "apple";
        System.out.println(h.charAt(0));

        // toUpperCase() : 문자열에 소문자를 대문자로 반환
        String i = "apple";
        System.out.println(i.toUpperCase());

        // toLowerCase() : 소문자로 반환
        String j = "APPLE";
        System.out.println(j.toLowerCase());

        // trim() : 문자열의 앞 뒤 공백을 제거
        String k = "    1234 1234 1234   ";
        System.out.println(k);
        System.out.println(k.trim());

        // contains() : 문자열을 비교해 비교 문자열이 있는지 비교
        String l = "apple";
        String m = "a";

        System.out.println(l.contains(m));

        // concat() : 문자와 문자를 결합해준다
        System.out.println(l.concat(m));



    }
}
