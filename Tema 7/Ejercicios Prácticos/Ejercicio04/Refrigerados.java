package Ejercicio04;

    public class Refrigerados extends Productos{
        int codigoOrganismoSupervision;
        int temperaturaRecomendada;

        public Refrigerados(int numLote, String fechaEnvasado, String fechaCaducidad, String paisOrigen,
                int codigoOrganismoSupervision, int temperaturaRecomendada) {
            super(numLote, fechaEnvasado, fechaCaducidad, paisOrigen);
            this.codigoOrganismoSupervision = codigoOrganismoSupervision;
            this.temperaturaRecomendada = temperaturaRecomendada;
        }
        
        public int getCodigoOrganismoSupervision() {
            return codigoOrganismoSupervision;
        }
        public void setCodigoOrganismoSupervision(int codigoOrganismoSupervision) {
            this.codigoOrganismoSupervision = codigoOrganismoSupervision;
        }
        public int getTemperaturaRecomendada() {
            return temperaturaRecomendada;
        }
        public void setTemperaturaRecomendada(int temperaturaRecomendada) {
            this.temperaturaRecomendada = temperaturaRecomendada;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return super.toString() + "\n Temperatura Recomendada: " + temperaturaRecomendada + " ºC" + "\n Código Organismo Supervisión Alimenticia: " + codigoOrganismoSupervision;
        }
    }
