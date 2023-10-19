package mg.tonymushah.itu.cloud.errors;

public class InvalidImatriculationException extends RuntimeException {
    public InvalidImatriculationException(String input){
        super(String.format("invalid input `%s` for an immatriculation", input));
    }
}
