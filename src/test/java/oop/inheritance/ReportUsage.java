package oop.inheritance;

/**
 * Created by Sergey
 */
public class ReportUsage {


    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);


        HtmlReport htmlReportreport = new HtmlReport();
        text = htmlReportreport.generate("Report's name", "Report's body");
        System.out.println(text);

        JSONReport jsonReport = new JSONReport();
        text=jsonReport.generate("Report's name", "Report's body");
        System.out.println(text);
    }

}
