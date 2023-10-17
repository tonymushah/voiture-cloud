package mg.tonymushah.itu.cloud.voiture.graphql.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import mg.tonymushah.itu.cloud.voiture.enums.ImatriculationType;

@Configuration
public class GraphQlConfig {
    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurer() {
        GraphQLScalarType imatriculationInner = ExtendedScalars
                .newRegexScalar("ImatriculationInner")
                .addPatterns(
                    ImatriculationType.civilPattern(), 
                    ImatriculationType.militaryPattern(), 
                    ImatriculationType.internationalPattern()
                )
                .build();
        return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.UUID).scalar(imatriculationInner);
    }
}