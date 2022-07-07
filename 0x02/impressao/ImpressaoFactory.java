public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPginas, int quantidadePaginasColoridas, boolean frenteVerso){
        Impressao impressao = new Impressao();
        impressao.setPaginasTotais(totalPginas);
        impressao.setPaginasColoridas(quantidadePaginasColoridas);
        impressao.setEhFrenteVerso(frenteVerso);
        impressao.setTamanhoImpressao(tamanhoImpressao);
        return impressao;
    }
}
