import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ajout {
	
		public static void main(String[] args) throws IOException
		{ Connection c=null;
		// montage de la connexion `a Orval
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		c = DriverManager.getConnection(
		"jdbc:oracle:thin:@oracle.fil.univ-lille1.fr:1521:filora",
		"DHRIF",
		"M1MIAGE");
		
		}
		catch(Exception e){System.out.print(e);}
		
	
		
		InputStreamReader isr;
		BufferedReader br;
		String id;;
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		System.out.print("Donner l identifiant de l etudiant: ");
		id= br.readLine();
		System.out.println(id);
		
		Statement st=null;
		try {
			
			st = c.createStatement();
           ResultSet resultSet = st.executeQuery("SELECT NOM,PRENOM,DATENAIS,RANG FROM CANDIDATS WHERE IDCAND="+ id   );
			
			while(resultSet.next()){
				String Nom=resultSet.getString("NOM");
				String Prenom=resultSet.getString("PRENOM");
				String Datenais=resultSet.getString("DATENAIS");
				String Rang=resultSet.getString("RANG");
				System.out.println(Nom +"\t"+Prenom +"\t"+Datenais + "\t"+Rang);
				/*resultSet.close();
				st.close();*/
		} }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}}