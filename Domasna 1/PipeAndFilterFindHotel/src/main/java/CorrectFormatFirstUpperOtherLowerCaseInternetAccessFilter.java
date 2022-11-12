public class CorrectFormatFirstUpperOtherLowerCaseInternetAccessFilter implements Filter<String> {


    @Override
    public String execute(String input) {
        String[] parts = input.split(",");
        StringBuilder stringBuilder = new StringBuilder();

        for (int position = 0; position < parts.length; position++) {

//            if (position == 20 && parts[position].equals("yes")) {
//                stringBuilder.append("Yes" + ",");} else
            if (position == 20 && parts[position].equals("YES")) {
                stringBuilder.append("Yes" + ",");
            }
//            else if (position == 20 && parts[position].equals("no")) {
//                stringBuilder.append("No" + ",");
//            }
            else if (position == 20 && parts[position].equals("NO")) {
                stringBuilder.append("No" + ",");
            } else if (position == 20 && parts[position].equals("CUSTOMERS")) {
                stringBuilder.append("Customers" + ",");
            } else if (position == 20 && parts[position] == "") {
                stringBuilder.append("No Info Available" + ",");
            } else if (position == 20 && parts[position].equals("")) {
                stringBuilder.append("No Info Available" + ",");
            } else if (position == 20 && parts[position] == null) {
                stringBuilder.append("No Info Available" + ",");
            } else if (position == 20) {
                stringBuilder.append("No Info Available" + ",");
            } else {
                stringBuilder.append(parts[position] + ",");
            }
        }
//        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
