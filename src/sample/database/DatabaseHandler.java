package sample.database;

import sample.model.Etudiant;

import java.sql.*;

import static java.lang.Class.forName;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + "/"
                + dbName;

        forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);


        return dbConnection;
    }

    public void addetudiant(Etudiant etudiant) {
     /*   String insert = "INSERT INTO " + Const.ETUDIANT_TABLE + "(" + Const.ETUDIANT_NOM
                + "," + Const.ETUDIANT_PRENOM + "," + Const.ETUDIANT_EMAIL + ","
                + Const.ETUDIANT_TEL + Const.ETUDIANT_SP + ")" + "VALUES(?,?,?,?,?)";*/
        String insert = "INSERT INTO etudiant (nom,prenom,email,telephone,specialite) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(insert);
            preparedStatement.setString(1, etudiant.getNom());
            preparedStatement.setString(2, etudiant.getPrenom());
            preparedStatement.setString(3, etudiant.getEmail());
            preparedStatement.setString(4, etudiant.getTelephone());
            preparedStatement.setString(5, etudiant.getSpecialite());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error" + e);
        }

       /* try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/gestion_etd", "root", "");
            String query = "INSERT INTO etudiant (nom,prenom,email,telephone,specialite) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = getDbConnection().prepareStatement(query);
            preparedStatement.setString(1, etudiant.getNom());
            preparedStatement.setString(2, etudiant.getPrenom());
            preparedStatement.setString(3, etudiant.getEmail());
            preparedStatement.setString(4, etudiant.getTelephone());
            preparedStatement.setString(5, etudiant.getSpecialite());
            preparedStatement.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error" + e);
        }

    }*/
    }
   /* public void selectEtudiant(Etudiant etudiant) throws SQLException {
        Statement stmt = dbConnection.createStatement();

        String sql = "SELECT nom, prenom, email, telephone, specialite FROM etudiant";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String email = rs.getString("email");
            String telephone = rs.getString("telephone");
            String specialite = rs.getString("specialite");

    }*/
/*public ResultSet getTasksByUser(int userId) {

    ResultSet resultTasks = null;

    String query = "SELECT nom, prenom, email, telephone, specialite FROM etudiant";

    try {
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(query);

        preparedStatement.setInt(1, userId);


        resultTasks = preparedStatement.executeQuery();

    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


    return resultTasks;*/
}


