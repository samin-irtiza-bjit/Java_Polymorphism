class SpaceObject {
    void info() {
        System.out.println("This is a generic space object.");
    }
}

class Planet extends SpaceObject {
    void info() {
        System.out.println("This is a planet.");
    }
}

class Star extends SpaceObject {
    void info() {
        System.out.println("This is a star.");
    }
}

class SpaceExploration {
    public static void main(String[] args) {
        SpaceObject mySpaceObject = new SpaceObject();
        SpaceObject myPlanet = new Planet();
        SpaceObject myStar = new Star();

        System.out.println(mySpaceObject.getClass());
        System.out.println(myPlanet.getClass());
        System.out.println(myStar.getClass());
        System.out.println();

        mySpaceObject.info();
        myPlanet.info();
        myStar.info();
    }
}
