package com.bridgelabs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StateCode {

    public static void main(String[] args) throws StateSensorAnalysisException, IOException {
        String filePathRead = "./src/main/resources/StateCode.csv";
        String fileName = "StateCode";
        String delimiter = ",";
        List<String> stringName = new ArrayList<>();
        stringName.add("SrNo");
        stringName.add("State");
        stringName.add("Name");
        stringName.add("TIN");
        stringName.add("StateCode");

        ReadOperations readObj = new ReadOperations();
        int count = readObj.readDataCount(filePathRead, fileName);
        System.out.println(count);

        readObj.readDelimiter(filePathRead, delimiter);
        readObj.readHeader(filePathRead, stringName);
    }
}