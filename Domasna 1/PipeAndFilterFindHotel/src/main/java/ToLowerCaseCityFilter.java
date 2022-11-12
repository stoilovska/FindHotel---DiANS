public class ToLowerCaseCityFilter implements Filter<String> {
    @Override
    public String execute(String input) {
        String[] parts = input.split(",");
        StringBuilder stringBuilder = new StringBuilder();

        if (parts.length < 4) {
            return input;
        }

        for (int position = 0; position < parts.length; position++) {
            if ((position == 16) && parts[position] != "") {
                String newCity = "";
                String city = parts[position].toLowerCase();
                newCity = Character.toUpperCase(city.charAt(0))+"";
                for (int i = 1; i<city.length(); i++ ) {
                    newCity +=  Character.toLowerCase(city.charAt(i));
                }
                stringBuilder.append(newCity + ",");
                newCity = "";
                city = "";
            }else if ((position == 16) && parts[position] == "") {
                stringBuilder.append("Skopje" + ",");
            } else {
                stringBuilder.append(parts[position] + ",");
            }
        }
//        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }
}
