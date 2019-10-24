package com.vehiculerental.customers;

import java.util.Date;

public interface CustomerInterface {
    /**
     * Récupère l'id du client.
     * @return l'id du client
     */
    public int getId();

    /**
     * Définit l'id du client.
     * @param id l'id du client
     */
    public void setId(int id);

    /**
     * Récupère l'email du client.
     * @return l'email du client
     */
    public String getEmail();

    /**
     * Définit l'email du client
     * @param email l'email du client
     */
    public void setEmail(String email);

    /**
     * Récupère le mot de passe du client.
     * @return le mot de passe du client
     */
    public String getPassword();

    /**
     * Définit le mot de passe du client
     * @param password le mot de passe du client
     */
    public void setPassword (String password);

    /**
     * Récupère le nom de famille du client.
     * @return le nom de famille du client
     */
    public String getLastName();

    /**
     * Définit le nom de famille du client
     * @param lastName le nom de famille du client
     */
    public void setLastName(String lastName);

    /**
     * Récupère le prénom du client.
     * @return le prénom du client
     */
    public String getFirstName();

    /**
     * Définit le prénom du client.
     * @param firstName le prénom du client
     */
    public void setFirstName(String firstName);

    /**
     * Récupère la date de naissance du client.
     * @return la date de naissance du client
     */
    public Date getDateOfBirth();

    /**
     * Définit la date de naissance du client.
     * @param dateOfBirth la date de naissance du client
     */
    public void setDateOfBirth(Date dateOfBirth);

    /**
     * Récupère le numéro d'obtention du permis.
     * @return le numéro d'obtention du permis
     */
    public Date getDateOfLicense();

    /**
     * Définit le numéro d'obtention du permis.
     * @param dateOfLicense le numéro d'obtention du permis
     */
    public void setDateOfLicense(Date dateOfLicense);

    /**
     * Récupère le numéro de permis.
     * @return le numéro de permis
     */
    public String getLicenseNumber();

    /**
     * Définit le numéro de permis.
     * @param licenseNumber le numéro de permis
     */
    public void setLicenseNumber(String licenseNumber);
}
