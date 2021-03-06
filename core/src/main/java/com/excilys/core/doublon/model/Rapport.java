package com.excilys.core.doublon.model;

import com.excilys.core.dto.ComputerDTO;

import java.util.ArrayList;
import java.util.List;

public class Rapport {

    // list of the variables
    private static final double VALIDATE_VALUE = 80.0;
    private static final double UNKNOWN_VALUE = 70.0;
    private List<ComputerDTO> toImport;
    private List<Conflict> toCheck;
    private List<Conflict> refuse;

    /**
     * The default constructor.
     */
    public Rapport() {
        this(new ArrayList<ComputerDTO>());
    }
    public Rapport(List<ComputerDTO> toImport) {
        this.toImport = toImport;
        this.toCheck = new ArrayList<>();
        this.refuse = new ArrayList<>();
    }

    public List<ComputerDTO> getToImport() {
        return toImport;
    }
    public List<Conflict> getRefuse() {
        return refuse;
    }
    public List<Conflict> getToCheck() {
        return toCheck;
    }
    public void setToImport(List<ComputerDTO> toImport) {
        this.toImport = toImport;
    }
    public void setToCheck(List<Conflict> toCheck) {
        this.toCheck = toCheck;
    }
    public void setRefuse(List<Conflict> refuse) {
        this.refuse = refuse;
    }
}
