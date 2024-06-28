public class ClassIntern {
    private String dataInternacao;
    private String dataAlta;
    private String leitoOcupado;
    private String procedimentosRealizados;

    public ClassIntern(String dataInternacao, String leitoOcupado, String procedimentosRealizados) {
        this.dataInternacao = dataInternacao;
        this.leitoOcupado = leitoOcupado;
        this.procedimentosRealizados = procedimentosRealizados;
        this.dataAlta = null;
    }

    public String getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(String dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getLeitoOcupado() {
        return leitoOcupado;
    }

    public void setLeitoOcupado(String leitoOcupado) {
        this.leitoOcupado = leitoOcupado;
    }

    public String getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    public void setProcedimentosRealizados(String procedimentosRealizados) {
        this.procedimentosRealizados = procedimentosRealizados;
    }
}
