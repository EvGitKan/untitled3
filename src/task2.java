import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String ELEMENT1 = "Студент ";
        String ELEMENT2 = " получил ";
        String ELEMENT3 = " по предмету ";

        String value = JSON.substring(1, JSON.length() - 1).replaceAll("[{}\"]", "");
        String[] arrayRows = value.split(",");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 7; i = i + 3) {
            result.append(ELEMENT1 + arrayRows[i].substring(arrayRows[i].indexOf(":") + 1));
            result.append(ELEMENT2 + arrayRows[i + 1].substring(arrayRows[i + 1].indexOf(":") + 1));
            result.append(ELEMENT3 + arrayRows[i + 2].substring(arrayRows[i + 2].indexOf(":") + 1) + "\n");
        }
        System.out.println(result);


//        StringBuilder stringBuilder = new StringBuilder(JSON);
//        String row1 = stringBuilder.substring(stringBuilder.indexOf(":\"") + 2, stringBuilder.indexOf("\","));
//        for (String i : arrayRows){
//            i.substring(i.indexOf(":\""))
//        }

//        String row2 = stringBuilder.substring(stringBuilder.indexOf(":\"", stringBuilder.lastIndexOf(row1)), stringBuilder.indexOf("\""));
//        String row3 = stringBuilder.substring(stringBuilder.indexOf(":\"", stringBuilder.lastIndexOf(row2)), stringBuilder.indexOf("\""));
//        System.out.println(ELEMENT1+row1+ELEMENT2+row2+ELEMENT3+row3);
    }
}

