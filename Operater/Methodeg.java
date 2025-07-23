class Computer {
    public void playMusic() {
        System.out.println("Playing music");
    }

    public String getmepen(int cost) {
        if (cost == 10) {
            return "PEN";
        } else {
            return "NO PEN";
        }
    }
}

public class Methodeg {
    public static void main(String[] args) {
        Computer com = new Computer();
        com.playMusic();
        String str = com.getmepen(2);  // Removed "cost:" and just passed the value
        System.out.println(str);
    }
}

