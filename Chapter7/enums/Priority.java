public enum Priority implements Bug {
    LOW {
        public void printPriority() {
            System.out.println("Priority level: LOW");
        }
    },
    MEDIUM,
    HIGH;

    public void printPriority() {
        System.out.println("Priority level: HIGH");
    }
}