public enum OrderStatus {
    PENDING {
        public void printMsg() {
            System.out.println("Order is pending.");
        }
    },
    PROCESSING {
        public void printMsg() {
            System.out.println("Order is being processed.");
        }
    },
    SHIPPED {
        public void printMsg() {
            System.out.println("Order has been shipped.");
        }
    },
    DELIVERED {
        public void printMsg() {
            System.out.println("Order has been delivered.");
        }
    },
    CANCELLED {
        public void printMsg() {
            System.out.println("Order has been cancelled.");
        }
    };

    public abstract void printMsg();
}