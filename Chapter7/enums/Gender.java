public enum Gender {
    MALE {
        public void printRate() {
            System.out.println("90%");
        }
    },
    FEMALE {
        public void printRate() {
            System.out.println("80%");
        }
    },
    OTHER;

    public void printRate() {
        System.out.println("100%");
    }
}