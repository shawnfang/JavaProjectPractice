import java.util.Objects;

public class ExamQuestion {
    private String question;
    private String select;
    private String answer;
    private String stuAnswer=null;

    public String getStuAnswer() {
        return stuAnswer;
    }

    public void setStuAnswer(String stuAnswer) {
        this.stuAnswer = stuAnswer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public boolean isAnswerTrue(){
        return answer == stuAnswer;
    }

    @Override
    public String toString() {
        return "ExamQuestion{" +
                "question='" + question + '\'' +
                ", select='" + select + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamQuestion that = (ExamQuestion) o;
        return Objects.equals(question, that.question) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(select, that.select);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer, select);
    }

}
