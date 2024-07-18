package lk.ijse.AAD.RD_Report;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Data user = new Data("Naveen", 1);
        String filename = "file.ser";

        // Serialization
        try(FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);)
        {
            // Method for serialization of object
            out.writeObject(user);
            System.out.println("Object has been serialized");
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


        Data user1 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            user1 = (Data)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("ID = " + user1.id);
            System.out.println("Name = " + user1.name);
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}