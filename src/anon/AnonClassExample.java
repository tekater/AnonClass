package anon;

public class AnonClassExample {
    private static String HI_STRING = "Get ready for the next battle!"; // константа static
    public static void main(String[] args) {
        final String finalRound = "Perfect round!"; // константа final местная переменная

        SpeakingEntity tekkenSpeaker = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println(HI_STRING);
            }

            @Override
            public void sayBye() {
                System.out.println(finalRound);
            }
        };
        tekkenSpeaker.sayHello();
        tekkenSpeaker.sayBye();
    }
}
