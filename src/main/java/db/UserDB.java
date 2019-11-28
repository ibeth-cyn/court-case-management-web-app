package db;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import controller.PasswordHash;
import model.Person;
import org.bson.Document;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import java.util.ArrayList;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.*;


// Reference - https://www.journaldev.com/3963/mongodb-java-crud-example-tutorial
// Reference - video series on Youtube
public class UserDB {

    //connecting to the server
    MongoClient mongoClient = new MongoClient("localhost", 27017);

    //creating database if it doesn't exist
    MongoDatabase getDB = mongoClient.getDatabase("userDetails");

    //creating a collection for court users names and info
    MongoCollection<Document> loginDetails = getDB.getCollection("courtUsers");

    public UserDB() throws InvalidKeySpecException, NoSuchAlgorithmException {

        ArrayList<Person> persons = createPerson();

        for (Person p: persons) {
            Document found = (Document) loginDetails.find(new Document("_id", p.getEmail())).first();
            if(found != null){
                System.out.println("User already exists in the database.");
            } else{
                loginDetails.insertOne(toDocument(p));
            }
        }

    }


    public static String hashPassword(String password) throws
            InvalidKeySpecException, NoSuchAlgorithmException {
        PasswordHash passwordHash = new PasswordHash();
        String hashed = passwordHash.createHash(password);
        return hashed;
    }

    public  final Document toDocument(Person person) {
        return new Document("_id", person.getEmail()).
                append("password", person.getPassword()).
                append("name", person.getName()).
                append("role", person.getRole());
    }


    //Reference - https://docs.mongodb.com/manual/tutorial/query-documents/
    //method that confirms if user exists in the database
    public String confirmUserExists(Person person){
        //Go into the database
        FindIterable<Document> findIterable = loginDetails.find(eq("_id",person.getEmail())).
                projection(include("password") );
        String email = null;
        String password = null;

        for(Document c: findIterable){
            System.out.println(c);

            email = c.getString("_id");
            password = c.getString("password");
        }
        if(person.getEmail().equals(email)){
            return password;
        }
        return password;
        }

    //method that returns the role of a user
    public String userRole(Person person){
        //Go into the database
        FindIterable<Document> findIterable = loginDetails.find(eq("_id",person.getEmail())).
                projection(fields(include("role"),excludeId()));

        String role = null;

        for (Document c: findIterable){
            role = c.getString("role");
        }
        return role;
    }

    private  ArrayList<Person> createPerson() throws InvalidKeySpecException, NoSuchAlgorithmException {
        String judgePassword = "#ntakIma1912";
        String registrarPassword = "#ntakNdi1906";
        String judgeHash = hashPassword(judgePassword);
        String registrarHash = hashPassword(registrarPassword);

        Person judge = new Person("ibethakpan@gmail.com",judgeHash,"Oyinkansola Abayomi","Judge");
        Person registrar = new Person("registrar@lagoshighcourt.ng", registrarHash, "Ndifreke-Abasi Akpan", "Registrar");

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(judge);
        personArrayList.add(registrar);
        return personArrayList;
    }
}
