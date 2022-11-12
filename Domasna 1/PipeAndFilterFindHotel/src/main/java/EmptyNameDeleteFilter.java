public class EmptyNameDeleteFilter implements Filter<String> {
    @Override
    public String execute(String input) {
        String[] parts = input.split(",");
        if (parts.length == 4) {
            return "";
        } else if (parts[4].equals("")) {
            return "";
        } else {
            return input;
        }
    }
}
