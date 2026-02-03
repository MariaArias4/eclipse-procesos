package quizPreguntas;

public class Pregunta {
    private String texto;
    private String respuesta;

    public Pregunta(String text, String answer) {
        this.texto = text;
        this.respuesta = answer;
    }

    public String getText() {
        return texto;
    }

    public String getAnswer() {
        return respuesta;
    }
}
