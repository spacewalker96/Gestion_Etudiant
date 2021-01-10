package sample.model;

public class Etudiant {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String specialite;

    public Etudiant(String nom, String prenom, String email, String telephone, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getSpecialite() {
        return specialite;
    }
}
