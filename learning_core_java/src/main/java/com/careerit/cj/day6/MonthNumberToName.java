package com.careerit.cj.day6;

enum ReportType {
  PDF, EXCEL, CSV
}
public class MonthNumberToName {


  private static  String generateReport(ReportType type) {
    return switch (type) {
      case PDF -> {
        System.out.println("PDF report is generated");
        yield "PDF generated using Apache FOP";
      }
      case EXCEL -> {
        System.out.println("Excel report is generated");
        yield "Excel report is generated using Apache POI";
      }
      case CSV -> {
        System.out.println("CSV report is generated");
        yield "CSV report is generated using OpenCSV";
      }
      default -> "Invalid report type";
    };
  }
   private static String getMonthName(int num) {
    return switch (num) {
      case 1 -> "Jan";
      case 2 -> "Feb";
      case 3 -> "Mar";
      case 4 -> "Apr";
      case 5 -> "May";
      case 6 -> "Jun";
      case 7 -> "Jul";
      case 8 -> "Aug";
      case 9 -> "Sep";
      case 10 -> "Oct";
      case 11 -> "Nov";
      case 12 -> "Dec";
      default -> "Invalid month number";
    };
  }
}
