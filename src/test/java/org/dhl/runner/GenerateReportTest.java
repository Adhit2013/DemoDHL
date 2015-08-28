package org.dhl.runner;

import junit.framework.TestCase;
import net.masterthought.cucumber.ReportBuilder;
import org.dhl.utils.Log;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class GenerateReportTest extends TestCase{


    public void testGenerateReport(){
        Date reportDate = Calendar.getInstance().getTime();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
        String reportGenerationTimeStamp = formatDate.format(reportDate);

        Log.info("Generating report on: " + reportGenerationTimeStamp);


        try {
            Process p1 = Runtime.getRuntime().exec("xcopy report\\cumcumber-html-report cucumber-reports\\HTMLReport-" + reportGenerationTimeStamp + "/i");
            p1.waitFor();

            Process p2 = Runtime.getRuntime().exec("cmd /c copy report\\cucumber-report.json cucumber-reports\\Report-" + reportGenerationTimeStamp + ".json");
            p2.waitFor();

            File reportOutputDirectory = new File("cucumber-reporting\\CucumberReport-" + reportGenerationTimeStamp);
            List<String> jsonReportFiles = new ArrayList<String>();
            jsonReportFiles.add("cucumber-reports\\Report-" + reportGenerationTimeStamp + ".json" );

            String buildNumber = "1";
            String buildProjectName = "Google Search";
            Boolean skippedFails = false;
            Boolean pendingFails = false;
            Boolean undefinedFails = false;
            Boolean missingFails = false;
            Boolean flashCharts = false;
            Boolean runWithJenkins = false;
            Boolean artifactsEnabled = false;
            String artifactConfig = "";
            Boolean highCharts = false;
            String pluginUrlPath = "";
            Boolean parallelTesting = false;
            ReportBuilder reportBuilder = new ReportBuilder(jsonReportFiles,reportOutputDirectory,pluginUrlPath,buildNumber,buildProjectName,skippedFails,pendingFails,undefinedFails,missingFails,flashCharts,runWithJenkins,artifactsEnabled,artifactConfig,highCharts,parallelTesting);
            reportBuilder.generateReports();
        }

        catch(Exception e){
            Log.error("Failed to generate report -  " + e.getMessage());
        }
    }
}