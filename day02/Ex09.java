public class Ex09 {
    public static void main(String[] args) {
        // ①for(②초기화;③조건;④증감){⑤반복할 내용}⑥
        // 1->2->3(true)->5->4->3(true)->5->4...
        // 5->4->3(false)->6

        int su=1;
        for(su=1;su<10;su++){
        System.out.println("2x"+su+"="+2*su);
        }
        System.out.println("su="+su);
    }
}
