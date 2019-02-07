package Zadanie;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WykopParser {
    public static void main(String[] args) throws IOException {
        URL wykop = new URL("https://www.wykop.pl");
        BufferedReader in = new BufferedReader(new InputStreamReader(wykop.openStream(), "UTF-8"));

        StringBuilder websiteSource = new StringBuilder();
        String tmp = null;
        while ((tmp = in.readLine()) != null) {
            websiteSource.append(tmp);
        }
        in.close();

        Document doc = Jsoup.parse(websiteSource.toString());
        Elements elements = doc.select("div.Icontrast.m-rest-margin").select("h2");

        for (Element e : elements) {
            System.out.println(e.text());
        }


    }
}
