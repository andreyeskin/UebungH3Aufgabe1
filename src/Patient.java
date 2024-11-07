import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Patient implements Comparable<Patient> {
    private String fallNr;
    private int svNr;
    private String vorname;
    private String nachname;
    private LocalDate gebdat;

    // Konstruktor
    public Patient(String fallNr, int svNr, String vorname, String nachname, LocalDate gebdat) {
        this.fallNr = fallNr;
        this.svNr = svNr;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebdat = gebdat;
    }

    // Getter für die Eigenschaften
    public String getFallNr() {
        return fallNr;
    }

    public int getSvNr() {
        return svNr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getGebdat() {
        return gebdat;
    }


    @Override
    public int compareTo(Patient o) {
        return 0;
    }
}
