package ru.dkadyrov.postmail.model;

public class Package extends Container3d {

    public Package(int length, int height, int weight) {
        super(length, height, weight);
    }

    public boolean canFitIn(Container3d container3d) {
        Container3d normalizedPack = normalize();
        Container3d normalizedBox = container3d.normalize();
        return normalizedBox.getLength() >= normalizedPack.getLength() &&
                normalizedBox.getHeight() >= normalizedPack.getHeight() &&
                normalizedBox.getWeight() >= normalizedPack.getWeight();
    }
}
