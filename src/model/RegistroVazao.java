package model;

/**
 * @author Arma X
 */
public class RegistroVazao {

    private String estacaoCodigo;
    private String nivelConsistencia;
    private String data;
    private String hora;
    private String mediaDiaria;
    private String metodoObtencaoVazoes;
    private String maxima;
    private String minima;
    private String media;
    private String diaMaxima;
    private String diaMinima;
    private String maximaStatus;
    private String minimaStatus;
    private String mediaStatus;
    private String mediaAnual;
    private String mediaAnualStatus;
    private String[] vazao;
    private String[] vazaoStatus;

    //Construtor
    public RegistroVazao(String linha_csv) {
        vazao = new String[31];
        vazaoStatus = new String[31];
        preencher(linha_csv);
    }

    public RegistroVazao() {
        this.estacaoCodigo = "";
        this.nivelConsistencia = "";
        this.data = "";
        this.hora = "";
        this.mediaDiaria = "";
        this.metodoObtencaoVazoes = "";
        this.maxima = "";
        this.minima = "";
        this.media = "";
        this.diaMaxima = "";
        this.diaMinima = "";
        this.maximaStatus = "";
        this.minimaStatus = "";
        this.mediaStatus = "";
        this.mediaAnual = "";
        this.mediaAnualStatus = "";
        this.vazao = new String[31];
        this.vazaoStatus = new String[31];
    }
    
    private void preencher(String linha_csv) {
        int i = 0;
        String[] temp = corrigeCampos(linha_csv);

        this.setData(temp[i++]);
        this.setNivelConsistencia(temp[i++]);
        this.setMediaDiaria(temp[i++]);        
        for (int j = 0; j < 31; j++) {
            this.setVazao(j, temp[i++]);
        }
        for (int j = 0; j < 31; j++) {
            this.setVazaoStatus(j, temp[i++]);
        }
    }
    //Transforma a linha csv em um vetor de strings, e corrige os erros em cada valor, para que possam
    //ser armazenados nas variáveis da classe
    private String[] corrigeCampos(String linha_csv) {
        String temp[] = linha_csv.split(";");
        for (int i = 0; i < temp.length; i++) {
            if (i <= 1 || i == 3 || (i >= 6 && i <= 10) || i == 12 || i > 43) {
                if (temp[i].equals("")) {
                    temp[i] = "-1";
                }
            } else if (i == 2) {
                if (temp[i].equals("")) {
                    temp[i] = "dataDeHoje";
                }
            } else {
                if (temp[i].equals("")) {
                    temp[i] = "-1.0";
                } else {
                    temp[i] = temp[i].replace(",", ".");
                }
            }
        }
        return temp;
    }
    
    public String getVazao(int indice) {
        return vazao[indice];
    }

    public void setVazao(int indice, String valor) {
        vazao[indice] = valor;
    }

    public String getVazaoStatus(int indice) {
        return vazaoStatus[indice];
    }

    public void setVazaoStatus(int indice, String valor) {
        vazaoStatus[indice] = valor;
    }

    /**
     * @return the estacaoCodigo
     */
    public String getEstacaoCodigo() {
        return estacaoCodigo;
    }

    /**
     * @param estacaoCodigo the estacaoCodigo to set
     */
    public void setEstacaoCodigo(String estacaoCodigo) {
        this.estacaoCodigo = estacaoCodigo;
    }

    /**
     * @return the nivelConsistencia
     */
    public String getNivelConsistencia() {
        return nivelConsistencia;
    }

    /**
     * @param nivelConsistencia the nivelConsistencia to set
     */
    public void setNivelConsistencia(String nivelConsistencia) {
        this.nivelConsistencia = nivelConsistencia;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the mediaDiaria
     */
    public String getMediaDiaria() {
        return mediaDiaria;
    }

    /**
     * @param mediaDiaria the mediaDiaria to set
     */
    public void setMediaDiaria(String mediaDiaria) {
        this.mediaDiaria = mediaDiaria;
    }

    /**
     * @return the metodoObtencaoVazoes
     */
    public String getMetodoObtencaoVazoes() {
        return metodoObtencaoVazoes;
    }

    /**
     * @param metodoObtencaoVazoes the metodoObtencaoVazoes to set
     */
    public void setMetodoObtencaoVazoes(String metodoObtencaoVazoes) {
        this.metodoObtencaoVazoes = metodoObtencaoVazoes;
    }

    /**
     * @return the maxima
     */
    public String getMaxima() {
        return maxima;
    }

    /**
     * @param maxima the maxima to set
     */
    public void setMaxima(String maxima) {
        this.maxima = maxima;
    }

    /**
     * @return the minima
     */
    public String getMinima() {
        return minima;
    }

    /**
     * @param minima the minima to set
     */
    public void setMinima(String minima) {
        this.minima = minima;
    }

    /**
     * @return the media
     */
    public String getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * @return the diaMaxima
     */
    public String getDiaMaxima() {
        return diaMaxima;
    }

    /**
     * @param diaMaxima the diaMaxima to set
     */
    public void setDiaMaxima(String diaMaxima) {
        this.diaMaxima = diaMaxima;
    }

    /**
     * @return the diaMinima
     */
    public String getDiaMinima() {
        return diaMinima;
    }

    /**
     * @param diaMinima the diaMinima to set
     */
    public void setDiaMinima(String diaMinima) {
        this.diaMinima = diaMinima;
    }

    /**
     * @return the maximaStatus
     */
    public String getMaximaStatus() {
        return maximaStatus;
    }

    /**
     * @param maximaStatus the maximaStatus to set
     */
    public void setMaximaStatus(String maximaStatus) {
        this.maximaStatus = maximaStatus;
    }

    /**
     * @return the minimaStatus
     */
    public String getMinimaStatus() {
        return minimaStatus;
    }

    /**
     * @param minimaStatus the minimaStatus to set
     */
    public void setMinimaStatus(String minimaStatus) {
        this.minimaStatus = minimaStatus;
    }

    /**
     * @return the mediaStatus
     */
    public String getMediaStatus() {
        return mediaStatus;
    }

    /**
     * @param mediaStatus the mediaStatus to set
     */
    public void setMediaStatus(String mediaStatus) {
        this.mediaStatus = mediaStatus;
    }

    /**
     * @return the mediaAnual
     */
    public String getMediaAnual() {
        return mediaAnual;
    }

    /**
     * @param mediaAnual the mediaAnual to set
     */
    public void setMediaAnual(String mediaAnual) {
        this.mediaAnual = mediaAnual;
    }

    /**
     * @return the mediaAnualStatus
     */
    public String getMediaAnualStatus() {
        return mediaAnualStatus;
    }

    /**
     * @param mediaAnualStatus the mediaAnualStatus to set
     */
    public void setMediaAnualStatus(String mediaAnualStatus) {
        this.mediaAnualStatus = mediaAnualStatus;
    }

    /**
     * @return the vazao
     */
    public String[] getVazao() {
        return vazao;
    }

    /**
     * @param vazao the vazao to set
     */
    public void setVazao(String[] vazao) {
        this.vazao = vazao;
    }

    /**
     * @return the vazaoStatus
     */
    public String[] getVazaoStatus() {
        return vazaoStatus;
    }

    /**
     * @param vazaoStatus the vazaoStatus to set
     */
    public void setVazaoStatus(String[] vazaoStatus) {
        this.vazaoStatus = vazaoStatus;
    }
}
