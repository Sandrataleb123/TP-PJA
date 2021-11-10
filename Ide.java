#include <iostream>
using namespace std;

int main() {
	// your code goes here
	return 0;
}
Import java.io.*;
public class Employee implements Serializable
{
public String name;
public String address;
public transient int SSN;
public int number;
public void mailCheck()
{
System.out.println("Mail de verification de " + name + " " + address);
 public class SerializeDemo
{
public static void main(String [] args)
{
Employee e = new Employee();
e.name = "Sandra Wassila";
e.address = "Coonstantine";
e.number = 111;
try
{
FileOutputStream fileOut =
new FileOutputStream("emp.dat");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(e);
out.close();
fileOut.close();
System.out.printf("donnees serialisees sauvegardees dans emp.dat");
}catch(IOException i)
{
i.printStackTrace();

ObjectInputStream ObjectInputStream= null ;
try
{
    objectinputstream = new ObjectInputStream(emp.dat);
}catch 
e.printStackTrace();


import java.io.*;

public class Main
{
public static void main(String args[])
{
try
{
    System.out.print("Entrez le num de lemployee ");
// Le fichier d'entrée
File file = new File("empdirect.dat");
// Créer l'objet File Reader
FileReader fr = new FileReader(file);
// Créer l'objet BufferedReader
BufferedReader br = new BufferedReader(fr);
StringBuffer sb = new StringBuffer();
String line;
while((line = br.readLine()) != null)
{
// ajoute la ligne au buffer
sb.append(line);
sb.append("\n");
}
fr.close();
System.out.println("Contenu du fichier: ");
System.out.println(sb.toString());
}
catch(IOException e)
{
e.printStackTrace();
}
}
}
    System.out.print("Entrez le num de lemployee ");

}