import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PipeAndFilterFindHotelProblem {
    public static void main(String[] args) throws FileNotFoundException {
        Pipe<String> pipe = new Pipe<>();

        EmptyNameDeleteFilter emptyNameDeleteFilter = new EmptyNameDeleteFilter();
        ToLowerCaseCityFilter toLowerCaseCityFilter = new ToLowerCaseCityFilter();
        ToUpperCaseInternetAccessFilter toUpperCaseInternetAccessFilter = new ToUpperCaseInternetAccessFilter();
        CorrectFormatFirstUpperOtherLowerCaseInternetAccessFilter correctFormatFirstUpperOtherLowerCaseFilter = new CorrectFormatFirstUpperOtherLowerCaseInternetAccessFilter();

        pipe.addFilter(toLowerCaseCityFilter);
        pipe.addFilter(toUpperCaseInternetAccessFilter);
        pipe.addFilter(correctFormatFirstUpperOtherLowerCaseFilter);
        pipe.addFilter(emptyNameDeleteFilter);

//        ClassLoader loader = PipeAndFilterFindHotelProblem.class.getClassLoader();
        Scanner scanner = new Scanner(new File("C:\\Users\\Teodora\\Desktop\\Domashna 1 DIANS\\PipeAndFilterFindHotel\\src\\main\\resources\\Hoteli1.csv"));


        scanner.useDelimiter(",");

        File outputFilteredCsvFile = new File("C:\\Users\\Teodora\\Desktop\\Domashna 1 DIANS\\PipeAndFilterFindHotel\\src\\main\\resources\\HoteliJavaPipeAndFilter.csv");

        try (PrintWriter printWriter = new PrintWriter(outputFilteredCsvFile)) {
            String prvRed = scanner.nextLine();
            printWriter.println(prvRed);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String result = pipe.runFilters(s);
                if (result.equals("")) {
                    continue;
                }
//                System.out.println(result);
                printWriter.println(result);
            }
        }
    }
}
