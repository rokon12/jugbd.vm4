package org.jugbd.vm4;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ProfileService profileService = new ProfileService();
        final List<Person> profiles = FakeDataGenerator.getAllProfiles();


        System.out.println(profiles);
    }
}
