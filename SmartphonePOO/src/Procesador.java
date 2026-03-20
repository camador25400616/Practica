public class Procesador {
    private String marca;
    private int nucleos;
    private double frecuenciaGHz;

    public Procesador(String marca, int nucleos, double frecuenciaGHz) {
        this.marca = marca;
        this.nucleos = nucleos;
        this.frecuenciaGHz = frecuenciaGHz;
    }

    public Procesador() {
    }

    public String getMarca() {
        return marca;
    }

    public int getNucleos() {
        return nucleos;
    }

    public double getFrecuenciaGHz() {
        return frecuenciaGHz;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setFrecuenciaGHz(double frecuenciaGHz) {
        this.frecuenciaGHz = frecuenciaGHz;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("===Procesador===").append("\n");
        sb.append("marca = ").append(marca).append("\n");
        sb.append("nucleos = ").append(nucleos).append("\n");
        sb.append("frecuenciaGHz = ").append(frecuenciaGHz).append("\n");
        return sb.toString();
    }
    
    
}
