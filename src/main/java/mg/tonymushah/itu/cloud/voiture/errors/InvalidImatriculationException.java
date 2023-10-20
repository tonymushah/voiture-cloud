package mg.tonymushah.itu.cloud.voiture.errors;

public class InvalidImatriculationException extends RuntimeException {
    public InvalidImatriculationException(String input){
        super(String.format("invalid input `%s` for an immatriculation", input));
    }
}
