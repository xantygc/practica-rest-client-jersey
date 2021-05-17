import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class RestClient
{
    public static void main (String[] args)
    {
        Client client = ClientBuilder.newClient();
    }
}
