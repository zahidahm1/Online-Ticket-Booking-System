public class InputReader {
    public static String readInput() {
        try {
            byte[] buffer = new byte[100];
            int bytesRead = System.in.read(buffer);
            return new String(buffer, 0, bytesRead).trim();
        } catch (Exception e) {
            return "";
        }
    }
}
