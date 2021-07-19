/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlecomissao;

/**
 *
 * @author maria
 */
public class MenuComissao {
    private Vendedor vendedor;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    public MenuComissao(){
    this.vendedor = new Vendedor();
    this.opcao = -1;
    this.conversor = new ConversorNumeros();
    this.io = new EntradaSaidaDados();
}
    public void executarControleComissao(){
    do{
        this.executarMenuPrincipal();
        this.avaliarOpcaoEscolhida();
    }while(this.opcao != 0);
}
    public void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção (Obs: selecione na sequência para exibir todas as informções corretamente): " // A opção 1 armazenará as informções inseridas para as demais, sem a necessidade de repeti-las.
                +"\n 1 - Criar Vendedor"
                +"\n 2 - Realizar Cálculo de Comissão do Vendedor"
                +"\n 3 - Exibir Vendedor"
                +"\n 4 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.StringToInt(entradaDados);
    }
    public void avaliarOpcaoEscolhida(){
        String saida, nome;
        double sb = 0, vv = 0;
        if(this.opcao != 0 && this.opcao == 1){
            String mensagemEntrada = "Digite o nome do vendedor: ";
            nome = (io.entradaDados(mensagemEntrada));
            vendedor.setNome(nome);
            mensagemEntrada = "Digite o salário base do vendedor: ";
            sb = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            vendedor.setSalarioBase(sb);
            mensagemEntrada = "Digite o valor vendido: ";
            vv = conversor.StringToDouble(io.entradaDados(mensagemEntrada));
            vendedor.setValorVendido(vv);
        }
        switch(this.opcao){
            case 1: 
                vendedor.criarVendedor();
                saida = "Nome do vendedor: "+ vendedor.getNome();
                io.saidaDados(saida);
                break;
            case 2: 
                vendedor.calcularComissao(vv);
                saida = "Salário Base: "+vendedor.getSalarioBase()
                        +"\nValor Vendido: "+vendedor.getValorVendido()
                        +"\nResultado do cálculo de comissão: "+ vendedor.getResultado();
                io.saidaDados(saida);
                break;
            case 3: 
                vendedor.exibirVendedor();
                saida = "   Informações do vendedor"
                        +"\nNome: "+ vendedor.getNome()
                        +"\nSalário Base: "+ vendedor.getSalarioBase()
                        +"\nValor da comissão: "+ vendedor.getResultado()
                        +"\nTotal do salário: "+ vendedor.getSalarioTotal();
                io.saidaDados(saida);
                break;
            case 4: 
                vendedor.sair();
            default:
                io.saidaDados("Opção Inválida!");
                break;
        }
    }
}
