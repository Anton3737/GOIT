//package task13.exercise1;
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//
//public class ParserJSON {
//
//    static String jsonParser(String url) throws IOException {
//
//        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//        connection.setRequestMethod("GET");
//
//        int responseCode = connection.getResponseCode();
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//            reader.close();
//            return response.toString();
//
//
////        String json = getJsonFromUrl("https://jsonplaceholder.typicode.com/users");
//
//            Gson gson = new Gson();
//
//
////            List<Root> userList = gson.fromJson(String.valueOf(req), new TypeToken<List<Root>>() {
////            }.getType());
//
////            for (Root root : userList) {
////                System.out.println("id: " + root.getId());
////                System.out.println("Name: " + root.getName());
////                System.out.println("Username: " + root.getUsername());
////                System.out.println("Email: " + root.getEmail());
////                System.out.println("Address: " + root.getAddress().getStreet() + ", " + root.getAddress().getCity());
////                System.out.println("Phone: " + root.getPhone());
////                System.out.println("Website: " + root.getWebsite());
////
////                System.out.println("------------------------------");
////
////                System.out.println(userList.size());
////            }
////        } else {
////            throw new IOException("HTTP response code: " + responseCode);
////        }
//
//}
