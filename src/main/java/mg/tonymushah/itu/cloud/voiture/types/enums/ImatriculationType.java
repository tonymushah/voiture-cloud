package mg.tonymushah.itu.cloud.voiture.types.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import mg.tonymushah.itu.cloud.voiture.errors.InvalidImatriculationException;

public enum ImatriculationType {
    CIVIL,
    MILITARY,
    INTERNATIONAL;
    public static Pattern civilPattern() throws PatternSyntaxException {
        return Pattern.compile("[0-9]{4} [A-Z]{2,3}", Pattern.CASE_INSENSITIVE);
    }
    public static Pattern militaryPattern() throws PatternSyntaxException {
        return Pattern.compile("[A-Z]{1,2} [0-9]{4}", Pattern.CASE_INSENSITIVE);
    }
    public static Pattern internationalPattern() throws PatternSyntaxException {
        return Pattern.compile("[0-9]{3} [A-Z]{2,3} [0-9]{3,4}", Pattern.CASE_INSENSITIVE);
    }
    
    public static Matcher civilMatcher(String input) throws PatternSyntaxException{
        return civilPattern().matcher(input);
    }
    public static Matcher militaryMatcher(String input) throws PatternSyntaxException{
        return militaryPattern().matcher(input);
    }
    public static Matcher internationalMatcher(String input) throws PatternSyntaxException{
        return internationalPattern().matcher(input);
    }

    public static boolean isCivil(String input) throws PatternSyntaxException{
        return civilMatcher(input).matches();
    }
    public static boolean isMilitary(String input) throws PatternSyntaxException{
        return militaryMatcher(input).matches();
    }
    public static boolean isInternational(String input) throws PatternSyntaxException {
        return internationalMatcher(input).matches();
    }

    public static ImatriculationType getType(String input) throws InvalidImatriculationException {
        if(isCivil(input)){
            return ImatriculationType.CIVIL;
        }else if (isMilitary(input)){
            return ImatriculationType.MILITARY;
        }else if (isInternational(input)){
            return ImatriculationType.INTERNATIONAL;
        }else{
            throw new InvalidImatriculationException(input);
        }
    }
}
