

public class GereHosp {
    public static void main(String[] args) {

        ClassPaci paciente = new ClassPaci("Xuxu da Silva Sauro", "Rua debaixo, 123", "05-12-1990", "Possui");

        ClassMed medico = new ClassMed("Dr. Mizael Dantas", "Rua sladasquantas, 456", "13-02-1975");

        ClassIntern internacao = new ClassIntern("27-06-2024", "Leito 1", "Cirurgia");

        ClassEnfe enfermeiro = new ClassEnfe("Cleber Miojo", "Av.Santa Mega Freira", "15-07-1998");

        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Plano de Saude: " + paciente.getPlanoSaude());
        System.out.println("Médico responsável: " + medico.getNome());
        System.out.println("Enfermeiro: " + enfermeiro.getNome());
        System.out.println("Data de internação: " + internacao.getDataInternacao());

        internacao.setDataAlta("2024-06-28");

        System.out.println("Relatório de internação:");
        System.out.println("Data de internação: " + internacao.getDataInternacao());
        System.out.println("Data de alta: " + internacao.getDataAlta());
        System.out.println("Procedimentos realizados: " + internacao.getProcedimentosRealizados());
    }
}
