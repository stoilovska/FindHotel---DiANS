public class ToUpperCaseInternetAccessFilter implements Filter<String> {
    @Override
    public String execute(String input) {
        String[] parts = input.split(",");
        StringBuilder stringBuilder = new StringBuilder();

        for (int position = 0; position < parts.length; position++) {

            if (position == 20 ){
                stringBuilder.append(parts[position].toUpperCase()+",");
            }else stringBuilder.append(parts[position]+",");
        }
//        System.out.println(stringBuilder.toString());
        return stringBuilder.toString();

    }
}

