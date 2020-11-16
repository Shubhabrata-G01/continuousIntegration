package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportConfiguration {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String currntDate;
	
	private void getDate() {
		// TODO Auto-generated method stub
	Date d = new Date();
	SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	currntDate = ft.format(d);
	}
	
	public static ExtentReports getInstance() {
		if(extent==null) {
			return createInstance("C:/Users/shubh/Desktop/Try/RestBDD/Reports/extent.html");
		}
		else {
			return extent;
		}
	}
	
	
	public static ExtentReports createInstance(String fileName) {
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	
	htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
	htmlReporter.config().setChartVisibilityOnOpen(true);
	htmlReporter.config().setTheme(Theme.STANDARD);
	htmlReporter.config().setReportName(" Automation Report");
	htmlReporter.config().setDocumentTitle(fileName);
	htmlReporter.config().setEncoding("utf-8");
	
	extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	return extent;
				
	}
	

	
}
