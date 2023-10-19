/*package service;

import java.io.*;

public class PayService{
	public void read() {
		
		try {
			FileReader fread = new FileReader(\"C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\SchoolMaagement\\students.csv\");
			BufferedReader br = new BufferedReader(fread);
			Student student = new Student();
			String line = null;
			String spitBy = ",";
			List<Students> students = new ArrayList<>();
			int count = 0;
			if (count != 0) {
				while((line = br.readLine()) != null) {
					if(count != 0) {
						String[] studentList = line.split(spitBy);
						student.setStudId(studentList[0].trim());
						student.setName(studentList[1].trim());
						student.setDepartmennt(studentList[2].trim());
						int age = "";
						age = ((studetList[4].trim()!=null && Integer.valueOf(stuudentList[4].trim())) >= 19) ? 
								Integer.valueOf(studentList[3].trim()): 0;
						String CSV = studentList[3].trim();
						String[] values = csv.split(";");
						
					}
				}
				br.close();
				fread.close();
			} catch (IOException ex) {
				
			}
				
	}

	}*/
package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import datamodel.Students;

public class PayService {
    public List<Students> read() {
        List<Students> students = new ArrayList<>();
        String csvFilePath = "C:\\Users\\emmaj\\OneDrive\\Bureau\\Java sem1 year 2\\SchoolManagement\\students.csv";

        try {
            FileReader fileReader = new FileReader(csvFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String splitBy = ",";
            int count = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (count != 0) {
                    String[] studentList = line.split(splitBy);
                    Students student = new Students();
                    student.setStudId(studentList[0].trim());
                    student.setName(studentList[1].trim());
                    student.setDepartment(studentList[2].trim());

                    try {
                        int age = Integer.valueOf(studentList[3].trim());
                        if (age >= 19) {
                            student.setAge(String.valueOf(age));
                        } else {
                            student.setAge("0");
                        }
                    } catch (NumberFormatException e) {
                        student.setAge("0");
                    }

                    students.add(student);
                }
                count++;
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return students;
    }
}

