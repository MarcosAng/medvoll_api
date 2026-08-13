package med.voll.api.controller;

import med.voll.api.medico.Especialidade;
import med.voll.api.medico.Medico;

public record DadosListagemMedicos(String nome, String email, String crm, Especialidade especialidade) {
    public DadosListagemMedicos(Medico medico){
        /*this.crm = medico.getCrm();
        this.email = medico.getEmail();
        this.nome = medico.getNome();
        this.especialidade = medico.getEspecialidade();*/
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());

    }
}
