package com.example.raja.gcmserver;

public class App {

    public static void main( String[] args )
    {
        System.out.println( "Sending POST to GCM" );

        String apiKey = "AIzaSyApfqADy_7_ZWvRiHe5lVLGAsEEIwBc26s";
        Content content = createContent();

        PostGcm.post(apiKey, content);
    }

    public static Content createContent(){

        Content c = new Content();

        c.addRegId("APA91bFqnQzp0z5IpXWdth1lagGQZw1PTbdBAD13c-UQ0T76BBYVsFrY96MA4SFduBW9RzDguLaad-7l4QWluQcP6zSoX1HSUaAzQYSmI93....");
        c.createData("Test Title", "Test Message");

        return c;
    }

}
