package smartphone.Iphone;

import smartphone.services.navegadorWeb.NavegadorInternet;
import smartphone.services.playerMusica.ReprodutorMusical;
import smartphone.services.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public Iphone(){
        System.out.println("Iniciando Iphone");
    }

    @Override
    public void Ligar(String numeroTelefone) {
        System.out.println("Ligando para: " + numeroTelefone);
    }

    @Override
    public void AtenderChamada() {
        System.out.println("Atendendo Chamada...");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void Tocar() {
        System.out.println("Tocando Musica...");
    }

    @Override
    public void Pausar() {
        System.out.println("Pausando Musica...");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("Selecionando Musica...");
    }

    @Override
    public void ExibirPagina(String url) {
        System.out.println("Carregando pagina: " + url);
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Atualizando pagina.");
    }
}
