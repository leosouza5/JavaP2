package br.unigran.dto;

import br.unigran.model.Funcionario;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class FuncionarioDTO extends DTO{
    public String cpfFuncionario;
    public String nomeFuncionario;
    public String sexoFuncionario;
    public String telefoneFuncionario;
    public String emailFuncionario;
    public Date datNascimentoFuncionario;
    public Date datAdmissaoFuncionario;
    public String cargoFuncionario;
    public Double salarioFuncionario;

    @Override
    public Funcionario builder() {
        Funcionario funcionario = new Funcionario();
        funcionario.setCPF(cpfFuncionario);
        funcionario.setNomeCompleto(nomeFuncionario);
        funcionario.setTelefone(telefoneFuncionario);
        funcionario.setEmail(emailFuncionario);
        funcionario.setDatNascimento(datNascimentoFuncionario);
        funcionario.setDtAdmissao(datAdmissaoFuncionario);
        funcionario.setCargo(cargoFuncionario);
        funcionario.setSalario(salarioFuncionario);
        funcionario.setId(id!=null?Long.valueOf(id):1);
        return funcionario;
    }
    
    public List getListaDados(List<Funcionario> dados) {
        List dadosDTO = new LinkedList();
        for (Funcionario dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }
    
    private Object converte(Funcionario f) {
        
        FuncionarioDTO dto= new FuncionarioDTO();

        dto.id=f.getId().toString();
        dto.nomeFuncionario=f.getNomeCompleto();
        dto.sexoFuncionario = f.getSexo();
        dto.cpfFuncionario = f.getCPF();
        dto.telefoneFuncionario = f.getTelefone();
        dto.emailFuncionario = f.getEmail();
        dto.datNascimentoFuncionario = f.getDatNascimento();
        dto.datAdmissaoFuncionario = f.getDtAdmissao();
        dto.cargoFuncionario = f.getCargo();
        dto.salarioFuncionario = f.getSalario();
        
        return dto;
    }
    
}
