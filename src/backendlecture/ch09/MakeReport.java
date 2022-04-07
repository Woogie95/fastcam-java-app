package backendlecture.ch09;

public class MakeReport {

    StringBuilder builder = new StringBuilder();

    private final String line = "===========================================\n";
    private final String title = "이름\t 주소\t 전화번호\n";

    private void makeHeader() {
        builder.append(line);
        builder.append(title);
        builder.append(line);
    }

    private void generateBody() {
        builder.append("최성욱 \t");
        builder.append("인천 서구 \t");
        builder.append("010-0000-0000\n");

        builder.append("홍길동 \t");
        builder.append("서울 관악 \t");
        builder.append("010-1234-4567 \n");
    }

    private void makeFooter() {
        builder.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return builder.toString();
    }
}
