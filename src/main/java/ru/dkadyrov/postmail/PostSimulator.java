package ru.dkadyrov.postmail;

import ru.dkadyrov.postmail.model.Box;
import ru.dkadyrov.postmail.model.Container3d;
import ru.dkadyrov.postmail.model.Package;

import java.util.Objects;

public class PostSimulator {

    public boolean isPackageFitInBox(Package pack, Box box) {
        requireValidContainer(pack, "Package should not be null and has positive dimensions");
        requireValidContainer(box, "Box should not be null and has positive dimensions");
        return pack.canFitIn(box);
    }

    private void requireValidContainer(Container3d container, String message) {
        Objects.requireNonNull(container, message);
        if (container.getHeight() <= 0 && container.getLength() <= 0 && container.getWeight() <= 0)
            throw new IllegalStateException(message);
    }

}
