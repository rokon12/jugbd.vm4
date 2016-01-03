package org.jugbd.vm4;

import org.fluttercode.datafactory.impl.DataFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/3/16.
 */
public class FakeDataGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileService.class);
    private static final int MAX = 100;
    private static Gender[] GENDERS = {Gender.MALE, Gender.FEMALE};
    private static final Random RANDOM = new Random();

    public static List<Person> getAllProfiles() {
        DataFactory df = new DataFactory();

        return IntStream.range(1, MAX).mapToObj(value -> Person.newBuilder()
                .withId((long) value)
                .withFirstName(df.getFirstName())
                .withLastName(df.getLastName())
                .withBirthDate(df.getBirthDate())
                .withEmail(df.getEmailAddress())
                .withGender(GENDERS[RANDOM.nextInt(2)])
                .withAddress(df.getAddress())
                .build()).collect(Collectors.toList());
    }
}
