package uk.co.autotrader.fundamentals11;

public class Students {
    
    private String name;
    private String subject;
    private Integer score;

    public Students(String name, String subject, Integer score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getScore() {
        return score;
    }

    public boolean scoreOver50(Integer score) {

        boolean over50 = false;

        if (score > 50) {
            over50 = true;
        }
        return over50;
    }

    @Override
    public String toString() {
        return
                name +
                ", " + subject +
                ", " + score + ".\n";
    }
    
}
