class MeshoRunner {
    public static void main(String[] args) {
        boolean isuserCreated = Mesho.createUser("Narsu",  4, 9611590710L, 3, 5, true, 'f', 4.5f);
        System.out.println("is user registered: " + isuserCreated);
        if (isuserCreated) {
         Mesho.getUserInfo();
        }
    }
}
