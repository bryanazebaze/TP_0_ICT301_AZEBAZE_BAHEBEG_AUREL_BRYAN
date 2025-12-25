package ict301.solid.isp;

// Interface trop large qui viole l'ISP
interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("L'humain travaille.");
    }
    public void eat() {
        System.out.println("L'humain mange sa pause déjeuner.");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Le robot travaille sans relâche.");
    }
    public void eat() {
        System.out.println("l'on ne doit pas faire manger un robot");
        throw new UnsupportedOperationException("Un robot ne mange pas !");
    }
}