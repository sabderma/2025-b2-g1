package com.monprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        String url = "jdbc:mysql://localhost:5222/mabase"; // Remplacer "maBase" par le nom de votre base
        String utilisateur = "root";
        String motDePasse = "";
      
       String sqlInsert = "INSERT INTO utilisateurs (nom, email) VALUES (?, ?)";
        String sqlSelect = "SELECT id, nom, email FROM utilisateurs WHERE nom = ?";

        try (Connection conn = DriverManager.getConnection(url, utilisateur, motDePasse)) {
            // Insertion d'un nouvel utilisateur
            try (PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert)) {
                pstmtInsert.setString(1, "Alice");
                pstmtInsert.setString(2, "alice@example.com");
                int rowsAffected = pstmtInsert.executeUpdate();
                System.out.println("Insertion réussie, lignes affectées : " + rowsAffected);
            }

            // Sélection des utilisateurs portant le nom "Alice"
            try (PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect)) {
                pstmtSelect.setString(1, "Alice");
                try (ResultSet rs = pstmtSelect.executeQuery()) {
                    System.out.println("Résultats de la requête : ");
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String nom = rs.getString("nom");
                        String email = rs.getString("email");
                        System.out.println("ID : " + id + ", Nom : " + nom + ", Email : " + email);
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("Erreur SQL : " + e.getMessage());
        }
    }
}
