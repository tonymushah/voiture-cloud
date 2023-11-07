package mg.tonymushah.itu.cloud.voiture.types.inputs;

import java.util.List;

public class VehiculeInput {
    private String imatriculation;
    private ModeleInputFromVehicule modele;
    private List<KilometrageInputFromVehicule> kilometrages;

    public String getImatriculation() {
        return imatriculation;
    }

    public void setImatriculation(String imatriculation) {
        this.imatriculation = imatriculation;
    }

    public ModeleInputFromVehicule getModele() {
        return modele;
    }

    public void setModele(ModeleInputFromVehicule modele) {
        this.modele = modele;
    }

    public List<KilometrageInputFromVehicule> getKilometrages() {
        return kilometrages;
    }

    public void setKilometrages(List<KilometrageInputFromVehicule> kilometrages) {
        this.kilometrages = kilometrages;
    }

    public VehiculeInput() {
    }

    public VehiculeInput(String imatriculation) {
        this.setImatriculation(imatriculation);
    }

    public VehiculeInput(String imatriculation, ModeleInputFromVehicule modele,
            List<KilometrageInputFromVehicule> kilometrages) {
        this.setImatriculation(imatriculation);
        this.setModele(modele);
        this.setKilometrages(kilometrages);
    }

}
