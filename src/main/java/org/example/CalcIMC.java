public class CalcIMC {

    private double peso;
    private double altura;

    char sexo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

    public String calculaImc(){
        double imc = peso/Math.pow(altura,2);
        String condicao;



        if (sexo == 'm'){
            if (imc < 20.7){
                condicao =  "Abaixo do peso";
            } else if (imc < 26.4){
                condicao = "Peso normal";
            } else if (imc < 27.8){
                condicao = "Marginalmente acima do peso";
            } else if (imc < 31.1){
                condicao = "Acima do peso ideal";
            } else
                condicao = "Obeso";

        } else {
            if (imc < 19.1){
                condicao = "Abaixo do peso";
            } else if (imc < 25.8){
                condicao = "Peso normal";
            } else if (imc < 27.3){
                condicao = "Marginalmente acima do peso";
            } else if (imc < 32.3){
                condicao = "Acima do peso ideal";
            } else
                condicao = "Obeso";
        }
        return condicao;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) throws Exception {
        if (sexo == 'f' || sexo == 'm'){
            this.sexo = sexo;
        } else {
            throw new Exception("Valor inválido, aceito somente f ou m!");
        }

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws Exception {
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new Exception("Valor inválido!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws Exception {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new Exception("Valor inválido!");
        }
    }
}
